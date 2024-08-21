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
def insertDB(mlist):
    conn = connDB() #db연결함수 호출
    cs = conn.cursor() #실행 선언 
    sql = "insert into dmovie values (movie_seq.nextval,:1,:2,:3)"
    cs.execute(sql, (mlist[0],mlist[1],mlist[2]))
    closeDB(cs, conn)