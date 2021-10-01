class Brazil():
	def capital(self):
		return 'Brasilia'
	def currency(self):
		return 'Brazilian real'

class USA():
	def capital(self):
		return 'Washington, DC'
	def currency(self):
		return 'US Dollars'

countries = [USA(), Brazil()]
for c in countries:
	print(c.capital())
	print(c.currency())

