import requests



URL = "https://haveibeenpwned.com/api/v3/breaches?domain=linkedin.com"

# parses the list of breaches
def parse_breaches(breaches):
	for breach in breaches:
		print(f'Breached domain: {breach["Domain"]} on {breach["BreachDate"]}')
		print("The following information was stolen: ")
		for info in breach["DataClasses"]:
			print(f"\t- {info}")

def main():
	response = requests.get(URL)
	parse_breaches(response.json())
	


if __name__ == '__main__':
	main()