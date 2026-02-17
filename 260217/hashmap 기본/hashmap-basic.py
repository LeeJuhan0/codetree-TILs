n = int(input())
commands = []
for _ in range(n):
    line = input().split()
    cmd = line[0]
    k = int(line[1])
    if cmd == "add":
        v = int(line[2])
        commands.append((cmd, k, v))
    else:
        commands.append((cmd, k))

dict = {}
for i in commands:
    key = i[1]
    if i[0] == 'add':
        dict[key] = i[2]
    elif i[0] == 'find' :
        if key in dict  :
            print(dict[key])
        else :
            print("None")
    elif i[0] == 'remove' :
        dict.pop(key)
