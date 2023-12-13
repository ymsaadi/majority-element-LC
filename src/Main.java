import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Youssef", 123);
        empIds.put("Hamza", 456);
        empIds.put("Kawtar", 789);

        System.out.println(empIds);
        System.out.println(empIds.get("Hamza"));
        System.out.println(empIds.containsKey("Youssef"));

        empIds.put("Hamza", 579);
        System.out.println(empIds.get("Hamza"));

        empIds.replace("Fatima", 579);
        System.out.println(empIds.get("Fatima"));

        empIds.putIfAbsent("Youssef", 555);
        System.out.println(empIds);

        System.out.println(majorityElement(new int[]{3,2,3}));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], numsMap.containsKey(nums[i]) ? numsMap.get(nums[i]) + 1 : 1);
            if (numsMap.get(nums[i]) > nums.length/2) {
                return nums[i];
            }
        }
        return 0;
    }
}

