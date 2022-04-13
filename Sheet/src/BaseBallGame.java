import java.util.LinkedList;

public class BaseBallGame {
    public int calPoints(String[] ops) {
        int res = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (String s : ops) {
            switch (s) {
                case "D": {
                    list.addLast(list.getLast() * 2);
                    res += list.getLast();
                    break;
                }
                case "+": {
                    list.addLast(list.getLast() + list.get(list.size() - 2));
                    res += list.getLast();
                    break;
                }
                case "C": {
                    res -= list.removeLast();
                    break;
                }
                default: {
                    list.addLast(Integer.parseInt(s));
                    res += Integer.parseInt(s);
                    break;
                }
            }
        }
        return res;
    }
}
