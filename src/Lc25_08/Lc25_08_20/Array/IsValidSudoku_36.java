package Lc25_08.Lc25_08_20.Array;


// {25.8.18}(数组) 有效数独
/**
 *<li>请你判断一个 9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 * <li>数字 1-9 在每一行只能出现一次。
 * <li>数字 1-9 在每一列只能出现一次。
 * <li>数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
 */
public class IsValidSudoku_36 {
    public static void main(String[] args) {
        Solution36 solution36 = new Solution36();

        // true
        char[][] board1 = new char[][]{{'5','3','.',  '.','7','.',  '.','.','.'}
                                      ,{'6','.','.',  '1','9','5',  '.','.','.'}
                                      ,{'.','9','8',  '.','.','.',  '.','6','.'}

                                      ,{'8','.','.',  '.','6','.',  '.','.','3'}
                                      ,{'4','.','.',  '8','.','3',  '.','.','1'}
                                      ,{'7','.','.',  '.','2','.',  '.','.','6'}

                                      ,{'.','6','.',  '.','.','.',  '2','8','.'}
                                      ,{'.','.','.',  '4','1','9',  '.','.','5'}
                                      ,{'.','.','.',  '.','8','.',  '.','7','9'}};
        System.out.println(solution36.isValidSudoku(board1));
        // false
        char[][] board2 = new char[][]{{'8','3','.','.','7','.','.','.','.'}
                                      ,{'6','.','.','1','9','5','.','.','.'}
                                      ,{'.','9','8','.','.','.','.','6','.'}
                                      ,{'8','.','.','.','6','.','.','.','3'}
                                      ,{'4','.','.','8','.','3','.','.','1'}
                                      ,{'7','.','.','.','2','.','.','.','6'}
                                      ,{'.','6','.','.','.','.','2','8','.'}
                                      ,{'.','.','.','4','1','9','.','.','5'}
                                      ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(solution36.isValidSudoku(board2));
    }
}


// 1ms   99%
// 1.就按他的要求写代码      抄的网友题解
class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] >= '0' && board[i][j] <= '9'){
                    if(!getEffective(i, j, board)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean getEffective(int i, int j, char[][] board){
        // 验证一行
        for(int k = 0; k < board[i].length; k++){
            if(board[i][k] == board[i][j] && k != j){
                return false;
            }
        }
        // 验证一列
        for(int k = 0; k < board.length; k++){
            if(board[k][j] == board[i][j] && k != i){
                return false;
            }
        }
        // 验证当前 3 * 3 数组
        int heng = (i / 3) * 3;
        int zhong = (j / 3) * 3;

        for(int k1 = heng; k1 < heng + 3; k1++){
            for(int k2 = zhong; k2 < zhong + 3; k2++){
                if((board[k1][k2] == board[i][j]) && (k1 != i && k2 != j)){
                    return false;
                }
            }
        }

        return true;
    }
}
