from Animals import Cow
# from subprocess import call
class Vocalizer:
    def vocalize(self):
        # call(['say', self.name + 'says' + self.sound()])
        print("Vocalizing cow sound here")
		
class VocalCow(Vocalizer, Cow):
    pass

c = VocalCow('Bessie')
print(c.speak())    # speak is inherited from cow
c.vocalize()        # vocalize is inherited from vocalizer