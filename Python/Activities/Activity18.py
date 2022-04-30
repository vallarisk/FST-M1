import pandas
dataframe = pandas.read_csv('examples/credentials.csv')
#Print the values only in the Usernames column
print("Username column: ")
print(dataframe["Usernames"])

#Print the username and password of the second row
print("username & password of second row: ")
print(dataframe["Usernames"][1],dataframe["Passwords"][1])

# Sort the Usernames column data in ascending order and print data
print("Usernames in ascending order: ")
print(dataframe.sort_values("Usernames"))

# Sort the Passwords column in descending order and print data
print("Usernames in ascending order: ")
print(dataframe.sort_values("Usernames", ascending=False))