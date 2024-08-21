import cx_Oracle
import os
import sys

print(sys.version)
# print(os.environ['ORACLE_HOME'])
# print(os.environ['path'])

con = cx_Oracle.connect("scott/tiger@localhost:1521/xe")
print (con.version)