import java.util.Stack;
/*
    stack => LIFO data structure. Last-in First-out
             stores objects into a sort of vertical tower
            push() use to add objects to the top. 
            pop() use to remove objects from top.
    uses of stacks?
            1. undo/redo feature in text editor.
            2. moving =back/forward throw browser history.
            3. backtracking algorithms (maze, file directories)
            4. calling functions (call stack)
*/ 
public class Stacks {

    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<String>();

        System.out.println("is stack empty? " + stack.empty()); // to check is it empty, answer is true
        
        stack.push("DOOM");
        stack.push("FFVI");
        stack.push("Skyrim");
        stack.push("Valorant");
        stack.push("Minecraft");
        stack.push("Assassin's cread");
    
        System.out.println("is stack empty? " + stack.empty()); // to check is it empty, answer is false

        System.out.println("objects in the stack is:\n=>" + stack); // to display obj in stack
        System.out.println("display top object in stack: " + stack.peek()); // display top obj in stack
        System.out.println("this objects is removed: " + stack.pop()); // to remove top obj in stack

        System.out.println("searching specific object {FFVI}" + stack.search("FFVI")); // display position obj in stack

        String myFavGame = stack.pop(); // remove top obj and store it in myFavGame
        System.out.println(myFavGame);

        System.out.println("display final stack:\n=>" + stack); // to display final stack

    }
}