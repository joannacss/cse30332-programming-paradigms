import tkinter as tk
from AnimalBehavior import *
import random,time
class Game:
	square_size = 20
	screen_size = 500
	def __init__(self, root):
		#Initialize grid
		self.root = root
		self.animalType = None
		self.root.title("Snake Game")
		self.canvas = tk.Canvas(self.root,width=self.screen_size,height=self.screen_size)
		self.canvas.pack(padx=10,pady=10)
		# self.snake = self.canvas.create_rectangle(1,1,self.square_size+1,self.square_size+1,fill="black",width=0)
		self.snake = self.canvas.create_rectangle(41,1,3*self.square_size+1,self.square_size+1,fill="black",width=0)
		self.score = 0
		self.scoreDisplay = tk.Label(self.root,text="Score:{}".format(self.score),font=('arial',20,'bold'))
		self.scoreDisplay.pack(anchor='n')
		self.length=3
		self.target=None
		self.gameStatus=1
		self.x=60
		self.y=0
		

		self.bodycoords=[(0,0)] 
		# Initialize buttons in a special button frame at bottom of screen
		# self.button_frame = tk.Frame(self.root)
		# self.button_frame.pack(side="bottom", fill="x", expand=False)
		
		
		root.bind("<Down>", self.linkKeys)
		root.bind("<Up>", self.linkKeys)
		root.bind("<Left>", self.linkKeys)
		root.bind("<Right>", self.linkKeys)


	def check_snake_coords(self):
		self.canvas.move(self.snake,self.x,self.y)
		i,j,ii,jj=self.canvas.coords(self.snake)
		if i<=0 or j<=0 or ii>=self.screen_size or jj>=self.screen_size:
			self.x=0
			self.y=0
			#gameover
			self.canvas.create_text(self.screen_size/2,self.screen_size/2,text="GAME OVER",font=('arial',40,'bold'),fill='red')
			self.gameStatus=0
		return

	def move_snake(self):
		i,j,ii,jj=self.canvas.coords(self.snake)
		ii=(ii-((ii-i)/2))
		jj=(jj-((jj-j)/2))
		self.bodycoords.append((ii,jj))
		self.canvas.delete('snakebody')
		if len(self.bodycoords) >= self.length:
			self.bodycoords=self.bodycoords[-self.length:]
		self.canvas.create_line(tuple(self.bodycoords),tag='snakebody',width=self.square_size,fill="black")
		return
		
	def food(self):
		if self.target==None:
			a=random.randint(20,480)
			b=random.randint(20,480)
			self.target=self.canvas.create_rectangle(a,b,a+20,b+20,fill='red',tag='food',width=0)
			#print(self.canvas.coords(self.target))
		if self.target:
			#print(self.canvas.coords(self.target))
			i,j,ii,jj=self.canvas.coords(self.target)
			#time.sleep(0.1)
			if len(self.canvas.find_overlapping(i,j,ii,jj))!=1:
				self.canvas.delete("food")
				self.target=None
				self.updateScore()
				self.length+=1
			return

	def updateScore(self):
		self.score+=1
		self.scoreDisplay['text']="Score : {}".format(self.score)
		return

	def linkKeys(self,event=None):
		print(event)
		pressedkey=event.keysym
		if pressedkey=='Left':
			self.x=-self.square_size
			self.y=0

		elif pressedkey=='Up':
			self.x=0
			self.y=-self.square_size

		elif pressedkey=='Right':
			self.x=self.square_size
			self.y=0

		elif pressedkey=='Down':
			self.x=0
			self.y=self.square_size

		else:
			pass
		return

	def manage(self):
		if(self.gameStatus==0):
			return
		self.check_snake_coords()
		self.move_snake()
		self.food()
		
		return

def main(): #run mainloop 
	root = tk.Tk()
	app = Game(root)
	while True:
	    root.update()
	    root.update_idletasks()
	    app.manage()
	    time.sleep(0.4)

if __name__ == '__main__':
	main()
	

