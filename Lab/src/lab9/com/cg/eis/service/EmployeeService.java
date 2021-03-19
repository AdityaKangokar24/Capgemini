package lab9.com.cg.eis.service;

import java.util.*;
import lab9.com.cg.eis.bean.*;
import lab9.com.cg.eis.pl.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

	public class EmployeeService {

		public String getSumOfSalary(List<Employee> elist) {
			double sal = elist.stream().collect(Collectors.summingDouble(Employee::getSalary));
			return String.valueOf(sal);
		}


		public List<Employee> getEmployeeWithoutDept(List<Employee> elist) {
			return elist.stream().filter(e -> e.getDep() == null).collect(Collectors.toList());
		}

		public List<Employee> didnotHaveManager(List<Employee> elist) {
			return elist.stream().filter(e -> e.getManagerId() == null).collect(Collectors.toList());
		}


		public List<Employee> sortName(List<Employee> elist) {
			return elist.stream().sorted(Comparator.comparing(Employee::getFirstName)).collect(Collectors.toList());
		}

		public List<Employee> sortEmpId(List<Employee> elist) {
			return elist.stream().sorted(Comparator.comparing(Employee::getEmployeeId)).collect(Collectors.toList());
		}

		public List<Employee> sortDeptId(List<Employee> elist) {
			return elist.stream().filter(e->e.getDep()!=null).sorted(Comparator.comparing(e->e.getDep().getDepartmentId())).collect(Collectors.toList());
		}

	}
	
