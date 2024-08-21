import oracleCon as oc

glist = ['새우깡',1000]
oc.insertDB(glist)


oc.selectAll('gmarket')