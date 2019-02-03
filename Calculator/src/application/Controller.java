package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Controller   {

	@FXML 
	private Pane canvas;
	
	@FXML
	private TextField veiwArea;
	

	@FXML
	private GridPane numPad;

	@FXML
	private Button butDivid;

	@FXML
	private Button butMultiply;

	@FXML
	private Button butAdd;

	@FXML
	private Button butSubtract;

	@FXML
	private Button butEnter;

	public static String currentNum = "";
	private static String operator = "";
	String formula;

	public void butten1() {
		currentNum += "1";
		veiwArea.setText(currentNum);
	}

	public void butten2() {
		currentNum += "2";
		veiwArea.setText(currentNum);
	}

	public void butten3() {
		currentNum += "3";
		veiwArea.setText(currentNum);
	}

	public void butten4() {
		currentNum += "4";
		veiwArea.setText(currentNum);
	}

	public void butten5() {
		currentNum += "5";
		veiwArea.setText(currentNum);
	}

	public void butten6() {
		currentNum += "6";
		veiwArea.setText(currentNum);
	}

	public void butten7() {
		currentNum += "7";
		veiwArea.setText(currentNum);
	}

	public void butten8() {
		currentNum += "8";
		veiwArea.setText(currentNum);
	}

	public void butten9() {
		currentNum += "9";
		veiwArea.setText(currentNum);
	}
	
	public void butten0() {
		currentNum += "0";
		veiwArea.setText(currentNum);
	}

	public void buttenDivid() {
		Calculator.divid(currentNum);
		currentNum = "";
		operator = " / ";
		veiwArea.setText(currentNum);
		lockMods(true);
	}

	public void buttenMultipy() {
		Calculator.multiply(currentNum);
		currentNum = "";
		operator = " * ";
		veiwArea.setText(currentNum);
		lockMods(true);
	}

	public void buttenSubtract() {
		Calculator.subtract(currentNum);
		currentNum = "";
		operator = " - ";
		veiwArea.setText(currentNum);
		lockMods(true);
	}

	public void buttenAdd() {
		Calculator.add(currentNum);
		currentNum = "";
		operator = " + ";
		veiwArea.setText(currentNum);
		lockMods(true);
	}

	public void buttenEnter() {

		if (operator.equals("")) {
			veiwArea.setText(currentNum);
		} else {

			if (currentNum.equals("")) {
				veiwArea.setText("error");
				currentNum = "";
				resetVars();
			}
			else {
				Calculator.getNumsArray()[1] = Double.parseDouble(currentNum);
				currentNum = "";
	
				double value = Calculator.calculate();
	
				formula = Calculator.getNumsArray()[0] + operator + Calculator.getNumsArray()[1] + " = ";
	
				veiwArea.setText(formula + value);
				currentNum = value + "";
				resetVars();
			}
		}

	}

	public void lockMods(boolean value) {

		butDivid.setDisable(value);
		butMultiply.setDisable(value);
		butAdd.setDisable(value);
		butSubtract.setDisable(value);
	}

	public void buttenClear() {
		resetVars();
		currentNum = "";
		veiwArea.setText("");
		lockMods(false);
		butEnter.setDisable(false);

	}

	public void resetVars() {
		formula = "";
		operator = "";
		Calculator.setMod(null);
		Calculator.getNumsArray()[0] = 0;
		Calculator.getNumsArray()[1] = 0;
	}

	
//	
//	@FXML 
//	public void keyPressed() {
//		veiwArea.setOnKeyPressed(new EventHandler<KeyEvent>() {
//		
//
//			@Override
//			public void handle(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//				switch ( e.getCode()) {
//
//				case DIGIT1:
//					butten1();
//					break;
//
//				case DIGIT2:
//					butten2();
//					break;
//
//				case DIGIT3:
//					butten3();
//					break;
//
//				case DIGIT4:
//					butten4();
//					break;
//
//				case DIGIT5:
//					butten5();
//					break;
//
//				case DIGIT6:
//					butten6();
//					break;
//
//				case DIGIT7:
//					butten7();
//					break;
//
//				case DIGIT8:
//					butten8();
//					break;
//
//				case DIGIT9:
//					butten9();
//					break;
//
//				case DIGIT0:
//					butten0();
//					break;
//
//				case ADD:
//					buttenAdd();
//					break;
//
//				case SUBTRACT:
//					buttenSubtract();
//					break;
//
//				case DIVIDE:
//					buttenDivid();
//					break;
//
//				case MULTIPLY:
//					buttenMultipy();
//					break;
//
//				case ENTER:
//					buttenEnter();
//					break;
//
//				case BACK_SPACE:
//					buttenClear();
//					break;
//
//				case NUMPAD1:
//					butten1();
//					break;
//
//				case NUMPAD2:
//					butten2();
//					break;
//
//				case NUMPAD3:
//					butten3();
//					break;
//
//				case NUMPAD4:
//					butten4();
//					break;
//
//				case NUMPAD5:
//					butten5();
//					break;
//
//				case NUMPAD6:
//					butten6();
//					break;
//
//				case NUMPAD7:
//					butten7();
//					break;
//
//				case NUMPAD8:
//					butten8();
//					break;
//
//				case NUMPAD9:
//					butten9();
//					break;
//
//				case NUMPAD0:
//					butten0();
//					break;
//
//				default:
//					System.out.println("invalid key entered.");
//					break;
//
//				}
//			}
//		});
//		
//
//	}

}
