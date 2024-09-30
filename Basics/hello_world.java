/**
 * In this curriculum, we assume you don't have any prior knowledge of computer
 * science or programming. If you do have some background, that's great!
 * 
 * The Example below shows how can you print a simple statement which have
 * become unoffical first law of programming you guessed it "Hello world"!
 * 
 * for the entire basic dir we will be following a refrence system for Example
 * when you see '[1]' on a code line refer that specific explation section after
 * the code block
 *
 */

class Hello_world { // [0]
	public static void main(String[] args) { // [1]
		System.out.println("Hello world"); // [2]
	}
}

/*
 * [0] For those who already know some other programming language, this is what
 * we call a main function,
 * but here in Java, we call this a Main class, and the main function comes
 * inside the Main class.
 * For those who don't:
 * A Main class is a class that acts as the entry point to the program. So
 * whenever you are compiling the code,
 * the javac (Java compiler) looks for this class. It’s preferable to name the
 * Main class after the file.
 *
 * [1] This here is what we call the main method. In Java, we don’t have
 * functions; we have methods,
 * because they are placed inside a class. This particular method is special.
 * Why? Remember what I told you:
 * "javac looks for this class." That’s not exactly correct. Javac doesn’t look
 * for a main class, but instead,
 * looks for this particular method. I know this is a lot to take in, but trust
 * me, it’s simple take a look at this anology.
 *
 * think of it as you went to a birthday party (Main class) but things can't get
 * started untill the birthday guy arrive ( Main method )
 * 
 * `public static void main(String[] args)` this statment have alot of keywords
 * for the time being take a look at:- `void`, `main`
 *
 * void:- as the name suggest void means nothing similarly this keyword means
 * this function dosen't return anything!
 * main:- it's just the name of the method. Its necessary to name the method
 * `main` since javac will be looking for this perticular key
 *
 * [2] This line is calls a in-built class called System and then call a method
 * called `out` which is responsible for output operation
 * 
 */
