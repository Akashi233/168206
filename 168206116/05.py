start = 'hit'
 end = 'cog'
 adict = ['hot','dot','dog','lot','log']
 count = []
 count.append(start)
 def huang(start, end, adict):
 	for s in range(0, int(len(start))):
 		for z in range(ord('a'), ord('z')+1):
 			start[s] = chr(z)
 			if start[s] == end[s]:
 				c = ''
 				for s in range(0, int(len(start))):
 					c += start[s]
 				count.append(c)
 				break

 astart = []
 for s in range(0, int(len(start))):
 	astart.append(start[s])	
 huang(astart, end, adict)
 print("路径：")
 print(count)
