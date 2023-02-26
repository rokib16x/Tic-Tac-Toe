package DuoSeriesMode;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DuoSeriesController {

    @FXML
    private Text whosTurn;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private Button b8;

    @FXML
    private Button b9;

    @FXML
    private Button tf1;

    @FXML
    private Button tf2;

    @FXML
    private Text tf;

    @FXML
    private Text p3;

    String turn = "X";
    static int i = 0, j = 0, round_count = 1;
    static String player = "Player 1";
    int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, val = 0, count = 0, val2 = 10;




    public void stopGame() {
        c1 = 5;
        c2 = 5;
        c3 = 5;
        c4 = 5;
        c5 = 5;
        c6 = 5;
        c7 = 5;
        c8 = 5;
        c9 = 5;
        whosTurn.setText("");
    }

    public void determineTurn() {
        val2++;
        if (val2 % 2 != 0) {
            turn = "X";
            player = "Player 1";
            whosTurn.setText("Player 2's turn");
        } else {
            turn = "O";
            player = "Player 2";
            whosTurn.setText("Player 1's turn");
        }
    }

    public void check() throws Exception {
        val++;

        if (b1.getText().equals(b5.getText()) && b1.getText().equals(b9.getText()) && !"".equals(b1.getText()) && !"".equals(b5.getText()) && !"".equals(b9.getText())) {
            whoWon();
            clean();
            endgame();
        }
        if (b3.getText().equals(b5.getText()) && b3.getText().equals(b7.getText()) && b3.getText() != "" && b5.getText() != "" && b7.getText() != "") {
            whoWon();
            clean();
            endgame();
        }
        if (b1.getText() == b2.getText() && b1.getText() == b3.getText() && b1.getText() != "" && b2.getText() != "" && b3.getText() != "") {
            whoWon();
            clean();
            endgame();
        }
        if (b4.getText() == b5.getText() && b4.getText() == b6.getText() && b4.getText() != "" && b5.getText() != "" && b6.getText() != "") {
            whoWon();
            clean();
            endgame();
        }
        if (b7.getText() == b8.getText() && b7.getText() == b9.getText() && b7.getText() != "" && b8.getText() != "" && b9.getText() != "") {
            whoWon();
            clean();
            endgame();
        }
        if (b1.getText() == b4.getText() && b1.getText() == b7.getText() && b1.getText() != "" && b4.getText() != "" && b7.getText() != "") {
            whoWon();
            clean();
            endgame();
        }
        if (b2.getText() == b5.getText() && b2.getText() == b8.getText() && b2.getText() != "" && b5.getText() != "" && b8.getText() != "") {
            whoWon();
            clean();
            endgame();
        }
        if (b3.getText() == b6.getText() && b3.getText() == b9.getText() && b3.getText() != "" && b6.getText() != "" && b9.getText() != "") {
            whoWon();
            clean();
            endgame();
        }
    }

    public void clean() {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        c6 = 0;
        c7 = 0;
        c8 = 0;
        c9 = 0;
        val = 0;
        val2 = 10;
        tf.setText(" ");
        p3.setText("Round " + round_count);
        whosTurn.setText("Player 1's turn");
        turn = "X";
    }

    public void whoWon() {
        round_count++;
        count = 1;
        if (player.equals("Player 1")) {
            i++;
            tf1.setText(i + "");
        } else {
            j++;
            tf2.setText(j + "");
        }
    }

    public void endgame() {
        if (round_count == 6) {
            p3.setText("");
            stopGame();
            if (i > j) {
                tf.setText("Player 1 won");
            } else if (j > i) {
                tf.setText("Player 2 won");
            } else {
                tf.setText("Tie");
            }
        }
    }

    public void cit() {
        if (count == 0) {
            tf.setText("Tie!!!");
            round_count++;
            clean();
            count = 0;
            endgame();
        }
    }

    public void button1() {
        count = 0;
        if (c1 < 1) {
            determineTurn();
            b1.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b1.setTextFill(Color.BLACK);
            } else {
                b1.setTextFill(Color.DARKRED);
            }
            c1++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(DuoSeriesController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void button2() {
        count = 0;
        if (c2 < 1) {
            determineTurn();
            b2.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b2.setTextFill(Color.BLACK);
            } else {
                b2.setTextFill(Color.DARKRED);
            }
            c2++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(DuoSeriesController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void button3() {
        count = 0;
        if (c3 < 1) {
            determineTurn();
            b3.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b3.setTextFill(Color.BLACK);
            } else {
                b3.setTextFill(Color.DARKRED);
            }
            c3++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(DuoSeriesController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void button4() {
        count = 0;
        if (c4 < 1) {
            determineTurn();
            b4.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b4.setTextFill(Color.BLACK);
            } else {
                b4.setTextFill(Color.DARKRED);
            }
            c4++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(DuoSeriesController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void button5() {
        count = 0;
        if (c5 < 1) {
            determineTurn();
            b5.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b5.setTextFill(Color.BLACK);
            } else {
                b5.setTextFill(Color.DARKRED);
            }
            c5++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(DuoSeriesController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void button6() {
        count = 0;
        if (c6 < 1) {
            determineTurn();
            b6.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b6.setTextFill(Color.BLACK);
            } else {
                b6.setTextFill(Color.DARKRED);
            }
            c6++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(DuoSeriesController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void button7() {
        count = 0;
        if (c7 < 1) {
            determineTurn();
            b7.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b7.setTextFill(Color.BLACK);
            } else {
                b7.setTextFill(Color.DARKRED);
            }
            c7++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(DuoSeriesController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void button8() {
        count = 0;
        if (c8 < 1) {
            determineTurn();
            b8.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b8.setTextFill(Color.BLACK);
            } else {
                b8.setTextFill(Color.DARKRED);
            }
            c8++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(DuoSeriesController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void button9() {
        count = 0;
        if (c9 < 1) {
            determineTurn();
            b9.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b9.setTextFill(Color.BLACK);
            } else {
                b9.setTextFill(Color.DARKRED);
            }
            c9++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(DuoSeriesController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    void changeScreen(ActionEvent event) throws IOException {
        Parent goToHome = FXMLLoader.load(getClass().getResource("/TicTacToeApp/TicTacToeMain.fxml"));
        Scene scene = new Scene(goToHome);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void resetGame(ActionEvent event) {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        c6 = 0;
        c7 = 0;
        c8 = 0;
        c9 = 0;
        val = 0;
        val2 = 10;
        i = 0;
        j = 0;
        round_count = 1;
        tf.setText(" ");
        tf1.setText("");
        tf2.setText("");
        whosTurn.setText("Player 1's turn");
        p3.setText("Round 1");
        turn = "X";

    }

}
