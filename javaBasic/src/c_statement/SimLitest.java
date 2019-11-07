package c_statement;

import java.util.Scanner;

public class SimLitest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("나는 금사빠다.");
		System.out.println("금방 사랑에 빠진다.");
		System.out.println("1. 예 / 2. 아니오");
		int a = Integer.parseInt(s.nextLine());
		if(a==1){
			System.out.println("연예할때 끌려다니는 타입이다.");
			System.out.println("1. 예 / 2. 아니오");
			a = Integer.parseInt(s.nextLine());
			if(a==1){
				System.out.println("감정표현에 솔직한편이다.");
				System.out.println("1. 예 / 2. 아니오");
				a = Integer.parseInt(s.nextLine());
				if(a==1){
					System.out.println("이성친구는 존재할 수 없다.");
					System.out.println("1. 예 / 2. 아니오");
					a = Integer.parseInt(s.nextLine());
					if(a==1){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
					} else if(a==2){
						System.out.println("B");
					}
				} else if(a==2){
					System.out.println("활동적인 데이트가 좋다.");
					System.out.println("1. 예 / 2. 아니오");
					a = Integer.parseInt(s.nextLine());
					if(a==1){
						System.out.println("이성친구는 존재할 수 없다.");
						System.out.println("1. 예 / 2. 아니오");
						a = Integer.parseInt(s.nextLine());
						if(a==1){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							System.out.println("1. 예 / 2. 아니오");
							a = Integer.parseInt(s.nextLine());
							if(a==1){
								System.out.println("D");
							} else if(a==2){
								System.out.println("C");
							}
						} else if(a==2){
							System.out.println("B");
						}
					} else if(a==2){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						System.out.println("1. 예 / 2. 아니오");
						a = Integer.parseInt(s.nextLine());
						if(a==1){
							System.out.println("D");
						} else if(a==2){
							System.out.println("C");
						}
					}
				}
			}else if(a==2){
				System.out.println("데이트 코스는 미리 짜는게 편하다.");
				System.out.println("1. 예 / 2. 아니오");
				a = Integer.parseInt(s.nextLine());
				if(a==1){
					System.out.println("활동적인 데이트가 좋다.");
					System.out.println("1. 예 / 2. 아니오");
					a = Integer.parseInt(s.nextLine());
					if(a==1){
						System.out.println("이성친구는 존재할 수 없다.");
					} else if(a==2){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						System.out.println("1. 예 / 2. 아니오");
						a = Integer.parseInt(s.nextLine());
						if(a==1){
							System.out.println("D");
						} else if(a==2){
							System.out.println("C");
						}
					}

				} else if(a==2){
					System.out.println("감정표현에 솔직한 편이다.");
					System.out.println("1. 예 / 2. 아니오");
					a = Integer.parseInt(s.nextLine());
					if(a==1){
						System.out.println("이성친구는 존재할 수 없다.");
						System.out.println("1. 예 / 2. 아니오");
						a = Integer.parseInt(s.nextLine());
						if(a==1){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							System.out.println("1. 예 / 2. 아니오");
							a = Integer.parseInt(s.nextLine());
							if(a==1){
								System.out.println("D");
							} else if(a==2){
								System.out.println("C");
							}
						} else if(a==2){
							System.out.println("B");
						}
					} else if(a==2){
						System.out.println("활동적인 데이트가 좋다.");
						System.out.println("1. 예 / 2. 아니오");
						a = Integer.parseInt(s.nextLine());
						if(a==1){
							System.out.println("이성친구는 존재할 수 없다.");
							System.out.println("1. 예 / 2. 아니오");
							a = Integer.parseInt(s.nextLine());
							if(a==1){
								System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓인다.");
								System.out.println("1. 예 / 2. 아니오");
								a = Integer.parseInt(s.nextLine());
								if(a==1){
									System.out.println("D");
								} else if(a==2){
									System.out.println("C");
								}
							} else if(a==2){
								System.out.println("");
							}
						} else if(a==2){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							System.out.println("1. 예 / 2. 아니오");
							a = Integer.parseInt(s.nextLine());
							if(a==1){
								System.out.println("D");
							} else if(a==2){
								System.out.println("C");
							}
						}
					}
				}

			}

		} else if(a==2){
			System.out.println("감정기복이 크지 않다.");
			System.out.println("1. 예 / 2. 아니오");
			a = Integer.parseInt(s.nextLine());
			if(a==1){
				System.out.println("연락이 없어도 믿고 기다리는 편이다");
				System.out.println("1. 예 / 2. 아니오");
				a = Integer.parseInt(s.nextLine());
				if(a==1){
					System.out.println("A");
				} else if(a==2){
					System.out.println("이성친구는 존재할 수 없다.");
					System.out.println("1. 예 / 2. 아니오");
					a = Integer.parseInt(s.nextLine());
					if(a==1){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
						System.out.println("1. 예 / 2. 아니오");
						a = Integer.parseInt(s.nextLine());
						if(a==1){
							System.out.println("D");
						} else if(a==2){
							System.out.println("C");
						}
					} else if(a==2){
						System.out.println("B");
					}
				}
			} else if(a==2){
				System.out.println("감정 표현에 솔직한 편이다.");
				System.out.println("1. 예 / 2. 아니오");
				a = Integer.parseInt(s.nextLine());
				if(a==1){
					System.out.println("이성친구는 존재할 수 없다");
					System.out.println("1. 예 / 2. 아니오");
					a = Integer.parseInt(s.nextLine());
					if(a==1){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						System.out.println("1. 예 / 2. 아니오");
						a = Integer.parseInt(s.nextLine());
						if(a==1){
							System.out.println("D");
						} else if(a==2){
							System.out.println("C");
						}
					} else if(a==2){
						System.out.println("B");
					}
				} else if(a==2){
					System.out.println("활동적인 데이트가 좋다.");
					System.out.println("1. 예 / 2. 아니오");
					a = Integer.parseInt(s.nextLine());
					if(a==1){
						System.out.println("이성친구는 존재할 수 없다.");
						System.out.println("1. 예 / 2. 아니오");
						a = Integer.parseInt(s.nextLine());
						if(a==1){
							System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓인다.");
							System.out.println("1. 예 / 2. 아니오");
							a = Integer.parseInt(s.nextLine());
							if(a==1){
								System.out.println("D");
							} else if(a==2){
								System.out.println("C");
							}
						} else if(a==2){
							System.out.println("B");
						}
					} else if(a==2){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						System.out.println("1. 예 / 2. 아니오");
						a = Integer.parseInt(s.nextLine());
						if(a==1){
							System.out.println("D");
						} else if(a==2){
							System.out.println("C");
						}
					}
				}
			}
		}

	}

}

