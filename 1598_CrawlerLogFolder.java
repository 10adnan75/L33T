class Solution {
    public int minOperations(String[] logs) {
        int c = 0;
        for (String log: logs) {
            if (log.equals("./")) {
                continue;
            }
            if (log.equals("../")) {
                c = c == 0 ? 0 : c - 1;
            } else {
                c++;
            }
        }
        return c;
    }
}

// Follow-up (Stack)
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> path = new Stack<>();
        for (String log: logs) {
            char c = log.charAt(1);
            if (c == '.') {
                if (!path.empty()) {
                    path.pop();
                }
            } else if (c != '/') {
                path.push(log);
            }
        }
        // System.out.print(path); // print path
        return path.size();
    }
}
