/* Date : 2022-01-17
 * Program : 개발자 채용 조건 검사 프로그램
 * Email : rhalstjr1999@naver.com
 * Author : Go min seok
 */
public class firstWeek {
	public static void main(String[] args)
	{
		int numArray[] = {0, 0, 0, 0, 0, 0};	//조건에 해당 되는 지원자를 카운트 할 정수 배열
		String[] infoDivide = new String[5];
		String[] queryDivide1 = new String[4];
		String[] queryDivide2 = new String[2];
		String[] info = new String[] {"java backend junior pizza 150",
				"python frontend senior chicken 210",
				"python frontend senior chicken 150",
				"cpp backend senior pizza 260",
				"java backend junior chicken 80",
				"python backend senior chicken 50"};
		String[] query = new String[] {"java and backend and junior and pizza 100",
				"python and frontend and senior and chicken 200",
				"cpp and - and senior and pizza 250",
				"- and backend and senior and - 150",
				"- and - and - and chicken 100",
				"- and - and - and - 150"};
		for(int i=0; i<6; i++)
		{
			queryDivide1 = query[i].split(" and ");	
			queryDivide2 = queryDivide1[3].split(" ");	//음식과 점수를 다시금 분리
			for(int j=0; j<6; j++)
			{
				infoDivide = info[j].split(" ");
				if(queryDivide1[0].equals(infoDivide[0]) || queryDivide1[0].equals("-"))
				{
					if(queryDivide1[1].equals(infoDivide[1]) || queryDivide1[1].equals("-"))
					{
						if(queryDivide1[2].equals(infoDivide[2]) || queryDivide1[2].equals("-"))
						{
							if(queryDivide2[0].equals(infoDivide[3]) || queryDivide2[0].equals("-"))
							{
								if(Integer.parseInt(queryDivide2[1]) <= Integer.parseInt(infoDivide[4]))
									numArray[i]++;
							}
						}
					}
				}
			}
		}
		System.out.printf("[%d,%d,%d,%d,%d,%d]", numArray[0],numArray[1],numArray[2],numArray[3],numArray[4],numArray[5]);
	}
}