
package TodoApplication;

import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import TodoApplication.Errata.ToDoException;

public class Main
{
	// Lodsa variables
	private static boolean errEvent;
	private static int keybInput;
	final private static String[] myCRUDCommand = { "ADD", "LIST", "EDIT", "REMOVE" };
	final private static String[] myAvailableCommands = { "MARK", "REMOVE ALL DONE ToDo Items", "SEARCH", "EDIT", "EXIT" };
	public static ArrayList<String> todoList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		drawMainMenu();
		//printCRUDcommand();
		
		
		
		
		
		
		
		
		
		
	//	mainLoopMainMenu();
		
		
		
		
		
		
		
		
	}
	
public static void AddToTheListToDoItem() {

		String today = timeStamp();
		todoList.add("[" + today + "]" + "Climb");
		todoList.add("[" + today + "]" + "Climb");
		todoList.add("[" + today + "]" + "Climb");
		todoList.add("[" + today + "]" + "Climb");

		// todoList.add("tjohooo");
		System.out.println("Todolistan:");
		System.out.println("Starting ToDo-Class point");
		int i = 0;
		for (String t : todoList) {
			System.out.print(i);
			System.out.print("," + "  ");
			System.out.print(t);
			System.out.print("\n");
			i++;
		}

		System.out.println("Ending point\n");
		System.out.println("-----------");

	}
	public static String timeStamp() { // String timeStamp = new
		// SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String timeStamp = "";
		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		return timeStamp;
	}
	public static void pluppeMenu() {
		System.out.println("Inside pluppeMenu");
		System.out.println("qwerty: QWERTY: QwERty");

		System.out.println("Size: " + todoList.size());
		System.out.println("\n");
		// printToDoListAllItems();
		System.out.println("Size pa todoList: " + todoList.size());
	}
	public static int getTodoListSize() {
		return todoList.size();
	}
	public static void addTodoItems(String toDoItems) throws ToDoException {
		try {
			todoList.add(toDoItems);
		} catch (NullPointerException e) {
			throw new ToDoException();
		}
		// todoList.add(nextIndex, toDoItems);
	}
	public static void addTodoItem() throws ToDoException {
		String addTodoItemString = "";
		addTodoItemString = Main.checkKeyboard();

		try {
			todoList.add(addTodoItemString);
		} catch (NullPointerException e) {
			throw new ToDoException();
		}

		// todoList.add(nextIndex, toDoItems);
	}
	public static void actAdd_ToDoItem() throws ToDoException {

		System.out.println("Inhere: " + "ToDo.actAdd_ToDoItem.");

		String addTodoItemString = "";
		// String actCommand = "";
		// actCommand = ""; // uiLogic_command;

		System.out.println("Du har hamnat: ADD, skriv in vad du vill:");
		addTodoItemString = Main.checkKeyboard();
		addTodoItemString = addTodoItemString.trim();
		if (addTodoItemString != null) {
			addToDoItemToTheList(addTodoItemString);
		}

		System.out.println("Test to run : addTodoItemString=Main.checkKeyboard();");
		System.out.println("addTodoItemString: " + addTodoItemString);

		try {
			todoList.add(addTodoItemString);
			System.out.println("Test to run todoList: addTodoItemString=Main.checkKeyboard();");
			// todoList.(addTodoItemString);
			// todoList.add(addTodoItemString);
		} catch (NullPointerException e) {
			throw new ToDoException();
		}
	}
	public static void actList_TodoItems() throws ToDoException {
		String addTodoItemString = "";
		addTodoItemString = Main.checkKeyboard();

		try {
			todoList.add("" + addTodoItemString + "");
		} catch (NullPointerException e) {
			throw new ToDoException();
		}

		// todoList.add(nextIndex, toDoItems);
	}
	public static void actMark_TodoItems() throws ToDoException {
		String addTodoItemString = "";
		addTodoItemString = Main.checkKeyboard();

		try {
			todoList.add(addTodoItemString);
		} catch (NullPointerException e) {
			throw new ToDoException();
		}

	}
	public static void actUnMarkTodoItem() throws ToDoException {
		String addTodoItemString = "";
		addTodoItemString = Main.checkKeyboard();

		try {
			todoList.add(addTodoItemString);
		} catch (NullPointerException e) {
			throw new ToDoException();
		}

		// todoList.add(nextIndex, toDoItems);
	}
	public static void actRemove_TodoItems() throws ToDoException {
		String addTodoItemString = "";
		addTodoItemString = Main.checkKeyboard();

		try {
			todoList.add(addTodoItemString);
		} catch (NullPointerException e) {
			throw new ToDoException();
		}

		// todoList.add(nextIndex, toDoItems);
	}
	public static void actRemoveAll_TodoItems() throws ToDoException {
		String addTodoItemString = "";
		addTodoItemString = Main.checkKeyboard();

		try {
			todoList.add(addTodoItemString);
		} catch (NullPointerException e) {
			throw new ToDoException();
		}

		// todoList.add(nextIndex, toDoItems);
	}
	public static void actSearch_TodoItems() throws ToDoException {
		String addTodoItemString = "";
		addTodoItemString = Main.checkKeyboard();

		try {
			todoList.add(addTodoItemString);
		} catch (NullPointerException e) {
			throw new ToDoException();
		}

		// todoList.add(nextIndex, toDoItems);
	}
	public static void actEdit_TodoItems() throws ToDoException {
		String addTodoItemString = "";
		addTodoItemString = Main.checkKeyboard();

		try {
			todoList.add(addTodoItemString);
		} catch (NullPointerException e) {
			throw new ToDoException();
		}

		// todoList.add(nextIndex, toDoItems);
	}
	public static void addTodoItem22() throws ToDoException {
		String addTodoItemString = "";
		addTodoItemString = Main.checkKeyboard();

		try {
			todoList.add(addTodoItemString);
		} catch (NullPointerException e) {
			throw new ToDoException();
		}

		// todoList.add(nextIndex, toDoItems);
	}
	/**
	 * @return the todoList
	 */
	public static ArrayList<String> getTodoList() {
		return todoList;
	}
	/**
	 * @param todoList
	 *            the todoList to set
	 */
	// public static void setTodoList(ArrayList<String> todoList) {
	// ToDo.todoList = todoList;
	// }
	public static void printToDoListAllItems() {
		System.out.println("Starting ToDo-Class point");
		int i = 0;
		for (String s : Main.todoList) {
			System.out.print(i);
			System.out.print("," + "  ");
			System.out.print(s);
			System.out.print("\n");
			i++;
		}

		System.out.println("Ending point\n");

	}

	public void ui() {
		doPrintAll();
	}

	// UiMenu ui = new UiMenu(); ui.drawMainMenu(); ui.mainLoopMainMenu(); }

	public static void gui() {
	} // Not yet implemented
	public static void init() {
	} // set some variables, not yet;
	public static void doPrintAll() {
		int i = 0;
		for (String t : todoList) {
			System.out.print(i);
			System.out.print("," + "  ");
			System.out.print(t);
			System.out.print("\n");
			i++;
		}

		// public static ArrayList<String>todoList;

		Date timeStamp = new Date();
		todoList = new ArrayList<>();
		todoList.add("hello" + timeStamp);

		//
		//
		//
		// ToDoItemList = ToDoInit.todoList;
		//
		// ToDoItemList.addToDoItemToTheList();todoList.add("["+timeStamp+"]"
		// + "Wash"); todoList.add("Workout");
		// todoList.add("Mop"); todoList.add("Vaccum");

		// private Date rightNow;

		// private

		// Much work to be done
	}
	public static void addToDoItemToTheList(String inputStringFromToDo) {
		Date timeStamp = new Date();
		// todoList = new ArrayList<>();
		// todoList.add("hello" + timeStamp);
		// rightNow = new Date();

		// System.out.println("wowowowowowowowwowowwowowo");
		todoList.add(inputStringFromToDo);

		System.out.println("Listan : " + todoList.size());
		// private static String uiLogic_command;
		// private static String keyOutput;
		// private static String hubba2;
		// private static String hubba3;
		// private static String RunCommand;
	}

	public static void mainBusinessLogic() {
		// uiLogic_command = "ADD";
		// execAction(uiLogic_command);
		System.out.println("wwwww");
	}
	public static void execAction(String uiLogic_command) {
		String uiLogic_CommandString = "";
		uiLogic_CommandString = uiLogic_command;

		try {
			switch (uiLogic_CommandString) {
			case "ADD":
				Main.actAdd_ToDoItem();
				break;
			case "LIST":
				Main.actList_TodoItems();
				break;
			case "MARK":
				Main.actMark_TodoItems();
				break;
			case "REMOVE":
				Main.actRemove_TodoItems();
				break;
			case "REMOVEALL":
				Main.actRemoveAll_TodoItems();
				break;
			case "SEARCH":
				Main.actSearch_TodoItems();
				break;
			case "EDIT":
				Main.actEdit_TodoItems();
				break;
			default:
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("resource")
	public static String checkKeyboard() throws NoSuchElementException, IllegalStateException {
		Scanner sc;
		// ToDo to = new ToDo();
		System.out.println("checkKeyboard");
		// errEvent = false;
		boolean errCheckString = false;
		String dummy = "";
		System.out.println("Above first while loop");
		while (true) {

			while (!errCheckString) {
				try {
					sc = new Scanner(System.in);
					dummy = sc.nextLine();
					errCheckString = true;

					System.out.println("dummy: contains: " + dummy);
					// System.exit(0);

					System.out.println();

					System.out.println("wwwww");

					// ToDo.pluppeMenu();
					// System.out.println("Pluppe executed");

					// ))

					return dummy;

				} catch (NoSuchElementException e1) // NULL
				{
					throw new NoSuchElementException();
				}

				catch (IllegalStateException e2) {
					throw new IllegalStateException();
				} catch (Exception e0) {
					e0.printStackTrace();
					e0.getMessage();
					break;
				}

			}
		}
	}
	public static void UiMenu() {

		// private static int keybInput;
		// private static boolean errEvent;

	}

	@SuppressWarnings("resource")
	public static void mainLoopMainMenu() {

		errEvent = false;
		Scanner sc = new Scanner(System.in);
		while (true) {
			while (errEvent == false) {
				try {
					keybInput = sc.nextInt();
					break;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			switch (keybInput) {
			case 1:
				System.out.println("Nr 1");
				execAction("ADD");
				break; // CREATE

			case 2:
				System.out.println("Nr 2");
				execAction("LIST");
				break; // LIST

			case 3:
				System.out.println("Nr 3");
				execAction("MARK");
				break; // MARK

			case 4:
				System.out.println("Nr 4");
				execAction("REMOVE");
				break; // REMOVE

			case 5:
				System.out.println("Nr 5");
				execAction("REMOVEALL");
				break; // REMOVE ALL

			case 6:
				System.out.println("Nr 6");
				execAction("SEARCH");
				break; // SEARCH

			case 7:
				System.out.println("Nr 7");
				execAction("EDIT");
				break; // EDIT

			case 0:
				tidyExit();
				System.exit(0);

				// case 2: execLIST(); break; // RETRIVE
				// case 3: execUPDATE(); break; // UPDATE
				// case 4: execREMOVE(); break; // DELETE
				//
				// case 5: execREMOVE_ALL(); break; // DELETE ALL
				// case 6: execMARK(); break; // MARK
				// case 7: execSEARCH(); break; // SEARCH
				// case 8: execMARK(); break; //
				// case 9: execMARK(); break;
				// case 10: execREMOVE_ALL(); break;
				//
				// case 0: execEXIT(); break;
				//
			default:
				System.out.println("Menuchoice (1-7)");
				break;

			}
		}
	}
	public static void tidyExit() {

		String cleanUpExit = "";

		cleanUpExit += "\n";
		cleanUpExit += "\n";
		cleanUpExit += "\n";

		cleanUpExit += "/-------------------------------------/" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/      Thank you for choosing         /" + "\n";
		cleanUpExit += "/         this product.               /" + "\n";
		cleanUpExit += "/                                     /" + "\n";
		cleanUpExit += "/-------------------------------------/" + "\n";

		System.out.println(cleanUpExit);

		// clearScreen();

	}
	// private String[] myCRUDCommand = {"ADD","LIST","EDIT","REMOVE"};
	// private String[] myAvailableCommands =
	// {"MARK","REMOVE ALL DONE ToDo Items","SEARCH","EDIT","EXIT"};
	public static void drawMainMenu() {
		// Draw menu
		// drawMainMenu_UI_Text_Layout
		System.out.println(buildmenu());
	}
	public static String buildmenu() {
		String printMainMenu = "";
		printMainMenu += "\n";
		printMainMenu += "\n";
		printMainMenu += "\n";
		printMainMenu += "/-------------------------------------/" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/         ToDo-Main-Menu              /" + "\n";
		printMainMenu += "/         --------------              /" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/   1. ADD                            /" + "\n";
		printMainMenu += "/   2. LIST                           /" + "\n";
		printMainMenu += "/   3. MARK                           /" + "\n";
		printMainMenu += "/   4. REMOVE                         /" + "\n";
		printMainMenu += "/   5. REMOVE ALL DONE                /" + "\n";
		printMainMenu += "/   6. SEARCH                         /" + "\n";
		printMainMenu += "/   7. EDIT                           /" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/   0. EXIT                           /" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/                                     /" + "\n";
		printMainMenu += "/-------------------------------------/" + "\n";
		return printMainMenu;
	}
	
	public static void printCRUDcommand(){
		String retCRUD_Command="";
		for (String s : myCRUDCommand)
		{
			retCRUD_Command += s + " ";
		}
		//retCRUDCommand
		String printCRUD_Menu = "";
		String printCRUD_Header = "";
		
				
		printCRUD_Menu += "/-------------------------------------/" + "\n";
		printCRUD_Menu += "/                                     /" + "\n";
		System.out.print(printCRUD_Menu);
		
		printCRUD_Header= "/         "+retCRUD_Command + "       /"+ "\n" ;
		System.out.print(printCRUD_Header);
		
		printCRUD_Menu =  "/                                     /" + "\n";
		printCRUD_Menu += "/                                     /" + "\n";
		printCRUD_Menu += "/                                     /" + "\n";
		printCRUD_Menu += "/                                     /" + "\n";
		printCRUD_Menu += "/                                     /" + "\n";
		printCRUD_Menu += "/-------------------------------------/" + "\n";
		System.out.println(printCRUD_Menu);
	
	}
}

