package ch02.lecture.p02type;

public class C11String {
	public static void main(String[] args) {
		String str1 = "" +
						"{\n" +
						"\t\"id\":\"winter\",\n" +
						"\t\"name\":\"눈송이\"\n" +
						"}";

		String str2 = """
						{
							"id":"Winter",
							"name":"눈송이"
						}
						""";

		System.out.println(str1);
		System.out.println("--------------------------------");
		System.out.println(str2);
		System.out.println("--------------------------------");
		String str = """
						나는 자바를 \
						학습합니다.
						나는 자바 고수가 될 겁니다.
						""";
		System.out.println(str);

		String str3 = """
						<html>
							<head> 
								<title> 웹 페이지 </title>
							</head>
							<body>
								<h1> 페이지 제목 </h1>
								<p>
									adsdadssad
									adasdadad
									aadsda
								</p>
							</body>
						</html>
						""";
		System.out.println(str3);
	}

	}
