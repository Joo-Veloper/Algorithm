package company;

import java.util.*;

public class number2 {
   /* public int[] solution(int num_teams, String[] remote_tasks, String[] office_tasks, String[] employees) {
        // 재택 근무 가능한 업무와 출근해야 하는 업무를 각각 Set에 저장
        Set<String> remoteSet = new HashSet<>(Arrays.asList(remote_tasks));
        Set<String> officeSet = new HashSet<>(Arrays.asList(office_tasks));

        // 팀 별로 사원 번호를 저장하는 리스트 배열
        List<Integer>[] teamMembers = new ArrayList[num_teams + 1];
        for (int i = 1; i <= num_teams; i++) {
            teamMembers[i] = new ArrayList<>();
        }

        // 각 사원의 재택근무 가능 여부를 저장하는 리스트
        List<Integer> remoteEmployees = new ArrayList<>();
        List<Integer> officeEmployees = new ArrayList<>();

        // 사원 정보 파싱
        for (String employee : employees) {
            String[] parts = employee.split(" ");
            int teamNumber = Integer.parseInt(parts[0]);
            teamMembers[teamNumber].add(Integer.parseInt(parts[0]));

            boolean canWorkRemotely = true;
            for (int i = 1; i < parts.length; i++) {
                if (officeSet.contains(parts[i])) {
                    canWorkRemotely = false;
                    break;
                }
            }

            if (canWorkRemotely) {
                remoteEmployees.add(Integer.parseInt(parts[0]));
            } else {
                officeEmployees.add(Integer.parseInt(parts[0]));
            }
        }

        // 팀 별로 최소 한 명은 출근해야 함
        for (int i = 1; i <= num_teams; i++) {
            if (!teamMembers[i].isEmpty()) {
                int minEmployeeNumber = Collections.min(teamMembers[i]);
                if (remoteEmployees.contains(minEmployeeNumber)) {
                    remoteEmployees.remove(Integer.valueOf(minEmployeeNumber));
                }
            }
        }

        // 결과를 정렬하여 배열로 변환
        Collections.sort(remoteEmployees);
        int[] result = new int[remoteEmployees.size()];
        for (int i = 0; i < remoteEmployees.size(); i++) {
            result[i] = remoteEmployees.get(i);
        }
        return result;
    }*/
   public static List<Integer> findRemoteWorkers(int numTeams, List<String> remoteTasks, List<String> officeTasks, List<String> employees) {
       Set<String> remoteTaskSet = new HashSet<>(remoteTasks);
       Map<Integer, List<Integer>> teamEmployees = new HashMap<>();
       List<Integer> result = new ArrayList<>();

       // 각 직원의 업무를 분석하고 재택 가능 여부 확인
       for (int i = 0; i < employees.size(); i++) {
           String[] parts = employees.get(i).split(" ");
           int teamNumber = Integer.parseInt(parts[0]);
           boolean canWorkRemote = true;

           for (int j = 1; j < parts.length; j++) {
               if (!remoteTaskSet.contains(parts[j])) {
                   canWorkRemote = false;
                   break;
               }
           }

           if (canWorkRemote) {
               result.add(i + 1);
               teamEmployees.computeIfAbsent(teamNumber, k -> new ArrayList<>()).add(i + 1);
           }
       }

       // 각 팀에서 최소 한 명은 출근해야 함
       for (Map.Entry<Integer, List<Integer>> entry : teamEmployees.entrySet()) {
           if (entry.getValue().size() == teamEmployees.get(entry.getKey()).size()) {
               int firstEmployee = entry.getValue().get(0);
               result.remove(Integer.valueOf(firstEmployee));
           }
       }

       Collections.sort(result);
       return result;
   }

    public static void main(String[] args) {
        int numTeams = 3;
        List<String> remoteTasks = Arrays.asList("development", "marketing", "hometask");
        List<String> officeTasks = Arrays.asList("recruitment", "education", "officetask");
        List<String> employees = Arrays.asList(
                "1 development hometask",
                "1 recruitment marketing",
                "2 hometask",
                "2 development marketing hometask",
                "3 marketing",
                "3 officetask",
                "3 development"
        );

        List<Integer> result = findRemoteWorkers(numTeams, remoteTasks, officeTasks, employees);
        System.out.println("재택근무 가능한 직원 번호: " + result);
    }
}


