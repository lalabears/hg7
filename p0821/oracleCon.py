import cx_Oracle
def connDB(): #DB 연결함수 
    conn = cx_Oracle.connect("scott/tiger@localhost:1521/xe")
    return conn
def closeDB(cs, conn): # DB 저장하고 연결 끊기 
    cs.close()
    conn.commit()
    conn.close()
def selectAll(tbname):
    conn = connDB() #db연결함수 호출
    cs = conn.cursor() #실행 선언 
    sql = "select * from " + tbname
    rows = cs.execute(sql)
    for row in rows:
        print(row) 
    closeDB(cs, conn)
    
def insertDB(glist):
    conn = connDB() #db연결함수 호출
    cs = conn.cursor() #실행 선언 
    sql = "insert into gmarket values (gmarket_seq.nextval,:1,:2)"
    cs.execute(sql, (glist[0],glist[1]))
    closeDB(cs, conn)