import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author satyanav
 * Find number of Employees Under every Employee
3.7
Given a dictionary that contains mapping of employee and his manager as a number of (employee, manager) pairs like below.

{ "A", "C" },
{ "B", "C" },
{ "C", "F" },
{ "D", "E" },
{ "E", "F" },
{ "F", "F" } 

In this example C is manager of A, 
C is also manager of B, F is manager 
of C and so on.
 *
 */
public class EmployeeDictionary {
	
	Map<String,List<String>> mapOfEmp = new HashMap<>();
	Map<String,String> mapOfData = new HashMap();
	
	
	public Map<String, List<String>> getMapOfEmp() {
		return mapOfEmp;
	}

	public void setMapOfEmp(Map<String, List<String>> mapOfEmp) {
		this.mapOfEmp = mapOfEmp;
	}

	public Map<String, String> getMapOfData() {
		return mapOfData;
	}

	public void setMapOfData(Map<String, String> mapOfData) {
		this.mapOfData = mapOfData;
	}

	public void loadEmployeeAndReportingToMap(String emp,String mgr) {
		mapOfData.put(emp, mgr);
	}
	
	public void generteEmpTree(Map<String,String> mapOfData) {
		for(Map.Entry<String, String> entryObj :mapOfData.entrySet()) {
			if(mapOfEmp.containsKey(entryObj.getValue())) {
				List<String> dataList = mapOfEmp.get(entryObj.getValue());
				dataList.add(entryObj.getKey());
				mapOfEmp.put(entryObj.getValue(), dataList);
			}else {
				List<String> dataList = new ArrayList<>();
				dataList.add(entryObj.getKey());
				mapOfEmp.put(entryObj.getValue(), dataList);
			}
		}
	}
	
	public List<Map.Entry<String, List<String>>> sortInDesc() {
		List<Entry<String, List<String>>> list = new LinkedList<Entry<String, List<String>>>(mapOfEmp.entrySet());
		Collections.sort(list,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Entry<String,List<String>> ob1 = (Entry<String, List<String>>) o1;
				Entry<String,List<String>> ob2 = (Entry<String, List<String>>) o2;
				return ((Integer)ob2.getValue().size()).compareTo(((Integer)ob1.getValue().size()));
			}
			
		});
		return list;
	}
	 
	public void findCEO() {
		System.out.println(sortInDesc().get(0).getKey());
	}

	public static void main(String[] args) {
		EmployeeDictionary empDic = new EmployeeDictionary();
		Map<String,String> empMap = new HashMap<>();
		empMap.put("A", "C");
		empMap.put("B", "C");
		empMap.put("C", "F");
		empMap.put("D", "E");
		empMap.put("E", "F");
		empMap.put("F", "F");
		empDic.setMapOfData(empMap);
		empDic.generteEmpTree(empMap);
		List<Map.Entry<String, List<String>>> list = empDic.sortInDesc();
		System.out.println("CEO :: "+list.get(0).getKey());
		
	}
}
