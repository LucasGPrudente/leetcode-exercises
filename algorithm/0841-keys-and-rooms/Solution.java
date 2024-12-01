class Solution {

    // Return true if you can visit all the rooms, or false otherwise
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;

        checkRooms(0, rooms, visited);

        for(boolean x : visited){
            if (x == false) { return false; }
        }

        return true;
    }

    // Mark current room as visited and visited other rooms
    public void checkRooms(int i, List<List<Integer>> rooms, boolean[] visited){
        List<Integer> room = new ArrayList<>(rooms.get(i));

        for(int key : room){
            if(visited[key] == false){
                visited[key] = true;
                checkRooms(key, rooms, visited);
            }
        }
    }
}