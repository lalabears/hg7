import cx_Oracle
def connDB(): #DB 연결함수 
    conn = cx_Oracle.connect("scott/tiger@localhost:1521/xe")
    return conn
def closeDB(cs, conn): # DB 저장하고 연결 끊기 
    cs.close()
    conn.commit()
    conn.close() 
def insertDB(glist):
    conn = connDB() #db연결함수 호출
    cs = conn.cursor() #실행 선언 
    sql = "insert into gallerylist values (:0,:1,:2,:3,:4,:5,:6,:7,:8,:9)"
    cs.execute(sql, (glist[0],glist[1],glist[2],glist[3],
                     glist[4],glist[5],glist[6],glist[7],
                     glist[8],glist[9]))
    closeDB(cs, conn)