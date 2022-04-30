import pandas

dataframe = pandas.read_excel("examples/employeeDetails.xlsx", sheet_name="Sheet1")
print(dataframe.columns).__sizeof__