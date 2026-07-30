class Solution {
    public List<List<String>> findDuplicate(String[] paths) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String path : paths) {

            String[] parts = path.split(" ");

            String directory = parts[0];

            for (int i = 1; i < parts.length; i++) {

                String file = parts[i];

                int idx = file.indexOf('(');

                String fileName = file.substring(0, idx);

                String content = file.substring(idx + 1, file.length() - 1);

                map.putIfAbsent(content, new ArrayList<>());

                map.get(content).add(directory + "/" + fileName);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for (List<String> list : map.values()) {
            if (list.size() > 1) {
                ans.add(list);
            }
        }

        return ans;
    }
}