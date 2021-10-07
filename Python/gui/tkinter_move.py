from tkinter import Canvas, Tk
import time


def move_rectangle(event):
	# move method (object you want to move, and the direction!)
	# .move (object, xAmount, yAmount )
	for i in range(10):
		c.move(rectangle, 10, 0)
		

root = Tk()
c = Canvas(root, width=400, height=200)
c.pack()
rectangle = c.create_rectangle(50, 25, 100, 75, fill="blue")
root.bind("<Button-1>", move_rectangle)
root.mainloop()

