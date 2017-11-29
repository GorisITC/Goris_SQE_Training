import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculation {

	private static double totalAverage;
	private static double Average;
	private static double standardDeviation;
	private static double standardDeviationTotal;
	private static int count;
	private static Map <Integer, Integer> error;
	private static Map <Integer, Integer> errors = new HashMap<>();
	
	public static double getAverageDuration(List <Request> requestList) {
		for (int i = 0; i < requestList.size(); i++) {
			Average += requestList.get(i).getDuration();
		}
		Average /= requestList.size();
		return Average;
	}

	public static double getAverageDurationTotal(List <RequestGroup> requestGroups) {
		count = 0;
		System.out.println("Average of requests duration" + "\n");
		for (int i = 0; i < requestGroups.size(); i++) {
			totalAverage += getAverageDuration(requestGroups.get(i).getRequestList());
			System.out.print(requestGroups.get(i).getName() + " - ");
			System.out.println(getAverageDuration(requestGroups.get(i).getRequestList()));
		}
		totalAverage /= requestGroups.size();
		System.out.println("Total - " + totalAverage);
		System.out.println("");
		return totalAverage;
	}
		 
	public static double getStandardDeviation(List <Request> requestList) {
		for (int i = 0; i < requestList.size(); i++) {
			standardDeviation += Math.pow((requestList.get(i).getDuration() - getAverageDuration(requestList)), 2);
		}
		standardDeviation /= requestList.size();
		standardDeviation = Math.sqrt(standardDeviation);
		System.out.println(standardDeviation);
		System.out.println("");
		return standardDeviation;
	}
	
	public static double getStandardDeviationTotal(List <RequestGroup> requestGroups) {
		count = 0;
		System.out.println("Standard Deviation" + "\n");
		for (int i = 0; i < requestGroups.size(); i++) {
			System.out.println(requestGroups.get(i).getName());
			getStandardDeviation(requestGroups.get(i).getRequestList());
			for (int j = 0; j < requestGroups.get(i).getRequestList().size(); j++) {
				standardDeviationTotal += Math.pow((requestGroups.get(i).getRequestList().get(j).getDuration() - totalAverage), 2);
				count++;
			}
		}
		standardDeviationTotal /= count;
		standardDeviationTotal = Math.sqrt(standardDeviationTotal);
		System.out.println("Total" + "\n" + standardDeviationTotal);
		System.out.println("");
		return standardDeviationTotal;
	}

	public static Map<Integer, Integer> errorRate(List <RequestGroup> requestGroups) {
		count = 0;
		System.out.println("Error Rate" + "\n");
		for (int i = 0; i < requestGroups.size(); i++) {
			System.out.println(requestGroups.get(i).getName());
			errorRatioGroup(requestGroups.get(i).getRequestList());
			for (Map.Entry<Integer, Integer> item : error.entrySet()) {
				if (errors.containsKey(item.getKey())) {
					errors.put(item.getKey(), errors.get(item.getKey()) + item.getValue());
				} else  {
					errors.put(item.getKey(), item.getValue());
				}
			}
			count += requestGroups.get(i).getRequestList().size();
		}
		System.out.println("Total");
		for (Map.Entry<Integer, Integer> error : errors.entrySet()) {
			System.out.println(error.getKey() + " - " + error.getValue() + " of " + count  + " - " + (error.getValue() * 100) / count + "%");
		}
		System.out.println("");
		return errors;
	}
	
	public static Map<Integer, Integer> errorRatioGroup(List <Request> requestList) {
		error  = new HashMap<>();
		for (int i = 0; i < requestList.size(); i++) {
			if (error.containsKey(requestList.get(i).getCode())) {
				error.put(requestList.get(i).getCode(), error.get(requestList.get(i).getCode()) + 1);
			} else {
				error.put(requestList.get(i).getCode(), 1);
			}
		}
		for (Map.Entry<Integer, Integer> item : error.entrySet()) {
			System.out.println("The error rate of " + item.getKey() + " - " + item.getValue() + " of " + requestList.size() + " - " + (item.getValue() * 100) / requestList.size() + "%");
		}
		System.out.println("");
		return error;
	}

	
}


