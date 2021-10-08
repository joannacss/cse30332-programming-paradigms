import tkinter as tk

class Window1:
    def __init__(self, root):
        self.root = root
        self.frame = tk.Frame(self.root)
        self.button1 = tk.Button(self.frame, text = 'New Window', width = 25, command = self.new_window)
        self.button1.pack()
        self.frame.pack()
    def new_window(self):
        self.newWindow = tk.Toplevel(self.root)
        self.app = Window2(self.newWindow)

class Window2:
    def __init__(self, root):
        self.root = root
        self.frame = tk.Frame(self.root)
        self.quitButton = tk.Button(self.frame, text = 'Quit', width = 25, command = self.close_windows)
        self.quitButton.pack()
        self.frame.pack()
    def close_windows(self):
        self.root.destroy()

def main(): #run mainloop 
    root = tk.Tk()
    app = Window1(root)
    root.mainloop()

if __name__ == '__main__':
    main()
