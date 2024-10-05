from collections import deque

graph = {}

graph["you"] = ["ahmed","ali","nadia"]
graph["ali"] = ["saif","samy","slama"]
graph["ahmed"] = ["saif","jemmy","shahd"]
graph["nadia"] = ["loay","slama","shahd"]

graph["jemmy"] = []
graph["shahd"] = []
graph["slama"] = []
graph["saif"] = []
graph["loay"] = []
graph["samy"] = []

def search(name):
    search_queue = deque()
    search_queue += graph[name]
    searched = set()
    while search_queue:
        person = search_queue.popleft()
        if not person in searched:
            if person_is_seller(person):
                print (person + " is a mango seller!")
                return True
            else:
                search_queue += graph[person]
                searched.add(person)
    return False

def person_is_seller(name):
    return name[-1] =="y"

search("you")
