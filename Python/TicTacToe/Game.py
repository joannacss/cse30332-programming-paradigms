import tkinter as tk
from tkinter import messagebox

# Code modified from:
# - https://levelup.gitconnected.com/how-to-code-tic-tac-toe-in-python-using-tkinter-e7f9ce510bfb
class TicTacToe:

    def __init__(self, root):
        #Initialize the top-level UI element
        self.root = root
        self.root.title = "TicTacToe"
        # Initializes the grid
        self.init_grid()
                
        #Displaying the player 
        self.p1_label = tk.Label(self.root,text="P1: X",height=3,font=("arial",12,"bold"),bg="white")
        self.p2_label = tk.Label(self.root,text="P2: O",height=3,font=("arial",12,"bold"),bg="white")
        self.l1 = self.p1_label
        self.l1.grid(row=0,column=0) # places it at the top
        # auxiliary fields to help check whether a player had won or not
        self.count = 0        
        self.board=[['','','',],
                    ['','','',],
                    ['','','',]]

    def init_grid(self):        
        #Grid buttons
        self.b1=tk.Button(self.root,text="",height=4,width=8,font="Times 15 bold",command=lambda: self.pressed_button(self.b1,0,0))
        self.b2=tk.Button(self.root,text="",height=4,width=8,font="Times 15 bold",command=lambda: self.pressed_button(self.b2,0,1))
        self.b3=tk.Button(self.root,text="",height=4,width=8,font="Times 15 bold",command=lambda: self.pressed_button(self.b3,0,2))
        self.b4=tk.Button(self.root,text="",height=4,width=8,font="Times 15 bold",command=lambda: self.pressed_button(self.b4,1,0))
        self.b5=tk.Button(self.root,text="",height=4,width=8,font="Times 15 bold",command=lambda: self.pressed_button(self.b5,1,1))
        self.b6=tk.Button(self.root,text="",height=4,width=8,font="Times 15 bold",command=lambda: self.pressed_button(self.b6,1,2))
        self.b7=tk.Button(self.root,text="",height=4,width=8,font="Times 15 bold",command=lambda: self.pressed_button(self.b7,2,0))
        self.b8=tk.Button(self.root,text="",height=4,width=8,font="Times 15 bold",command=lambda: self.pressed_button(self.b8,2,1))
        self.b9=tk.Button(self.root,text="",height=4,width=8,font="Times 15 bold",command=lambda: self.pressed_button(self.b9,2,2))

        self.b1.grid(row=2,column=0)
        self.b2.grid(row=2,column=1)
        self.b3.grid(row=2,column=2)

        self.b4.grid(row=3,column=0)
        self.b5.grid(row=3,column=1)
        self.b6.grid(row=3,column=2)

        self.b7.grid(row=4,column=0)
        self.b8.grid(row=4,column=1)
        self.b9.grid(row=4,column=2)
    
       
    def check_winner(self):
        pass #TODO
    
    #Changes the value of the button
    def pressed_button(self, button,row,col):
        #Checking if button is available
        if button["text"]=="":
            if self.count%2==0:
                button["text"]="X"
                self.l1 = self.p2_label # switch to P2
                self.board[row][col]="X"
            else:
                button["text"]="O"
                self.l1 = self.p1_label # switch to P2
                self.board[row][col]="O"
            self.count+=1
            self.check_winner()
        else:
            messagebox.showerror("Error","This box already has a value!")


#run mainloop 
def main(): 
    root = tk.Tk()
    app = TicTacToe(root)
    root.mainloop()

if __name__ == '__main__':
    main()
    

