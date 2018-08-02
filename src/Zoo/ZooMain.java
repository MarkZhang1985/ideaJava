package Zoo;

import java.util.Scanner;

/**
 * 动物园测试类
 */
public class ZooMain {

	public static void main(String[] args) throws InterruptedException {

		Zoo zoo = Zoo.getInstance();
		ZooManage zooManage = new ZooManage();
		String regexMainMenu = "[1-3]";
		String regexAnimalManageMenu = "[1-6]";


		System.out.println("欢迎使用动物园管理系统");
		System.out.println("正在初始化《晴朗动物园》，请稍后……");
		Thread.sleep( 2000 );
		System.out.println("初始化成功！");

		//进入主菜单
		mainw:while(true){
			System.out.println();
			System.out.println("||主菜单||");
			System.out.println("1、显示动物园信息");
			System.out.println("2、动物管理");
			System.out.println("3、退出系统");
			System.out.println();
			System.out.print("请选择：");

			Scanner scanner = new Scanner( System.in );
			if(scanner.hasNext()){
				String str = scanner.next();
				if(str.matches( regexMainMenu )){
					switch (str) {
						//主菜单：1、显示动物园信息
						case "1":
							zoo.show();
							break;

						//主菜单：2、动物管理
						case "2":
							managew:
							while (true) {
								System.out.println();
								System.out.println( "||动物管理菜单||" );
								System.out.println( "1、增加动物" );
								System.out.println( "2、删除动物" );
								System.out.println( "3、修改动物" );
								System.out.println( "4、查找动物" );
								System.out.println( "5、显示所有动物" );
								System.out.println( "6、返回主菜单" );
								System.out.println();
								System.out.print( "请选择：" );

								scanner = new Scanner( System.in );
								if (scanner.hasNext()) {
									str = scanner.next();
									if (str.matches( regexAnimalManageMenu )) {
										switch (str) {

											//动物管理：1、增加动物
											case "1":
												System.out.println( "\n当前动物种类；" );
												zoo.showSpecies();
												System.out.print( "\n请选择一种动物填加：" );
												scanner = new Scanner( System.in );
												if (scanner.hasNextLine()) {
													zooManage.addAnimal( scanner.nextLine().trim() );
												}
												break;

											//动物管理：2、删除动物
											case "2":
												if (zoo.animalNumber == 0) {
													System.out.println( "没有动物。" );
													break;
												}
												System.out.println( "\n当前动物列表；" );
												zoo.showAnimalList();
												System.out.print( "\n请选择一个序号，进行删除：" );
												scanner = new Scanner( System.in );
												if (scanner.hasNextInt()) {
													zooManage.deleteAnimal( scanner.nextInt() );
												} else {
													System.out.println( "输入有误。" );
												}
												break;
											//动物管理：3、修改动物
											case "3":
												if (zoo.animalNumber == 0) {
													System.out.println( "没有动物。" );
													break;
												}
												System.out.println( "\n当前动物列表；" );
												zoo.showAnimalList();
												System.out.println( "\n当前动物种类；" );
												zoo.showSpecies();
												System.out.print( "\n请选择要修改的序号：" );
												int num = -1;
												String name = null;
												scanner = new Scanner( System.in );
												if (scanner.hasNextInt()) {
													num = scanner.nextInt();
												}
												System.out.print( "\n请选择要修改的种类：" );
												scanner = new Scanner( System.in );
												if (scanner.hasNextLine()) {
													name = scanner.nextLine();
												}

												if (num != -1 && name != null) {
													zooManage.changeAnimal( num, name );
												} else {
													System.out.println( "输入有误。" );
												}

												break;

											//动物管理：4、查找动物
											case "4":
												if (zoo.animalNumber == 0) {
													System.out.println( "没有动物。" );
													break;
												}
												System.out.println( "\n当前共有动物：" + zoo.animalNumber + "" );
												System.out.println( "\n当前动物种类；" );
												zoo.showSpecies();
												System.out.println( "请选择一个序号或者一个种类进行查询。" );
												scanner = new Scanner( System.in );
												if (scanner.hasNextInt()) {
													zooManage.findAnimal( scanner.nextInt() );
													break;
												} else if (scanner.hasNextLine()) {
													name = scanner.nextLine().trim();
													zooManage.findAnimal( name );
												} else System.out.println( "输入有误。" );
												break;

											//动物管理：5、显示动物列表
											case "5":
												zoo.showAnimalList();
												System.out.println();
												break;

											//动物管理：6、返回主菜单
											case "6":
												System.out.println( "正在返回主菜单。。。" );
												Thread.sleep( 500 );
												break managew;
										}
									} else System.out.println( "输入命令有误，请重新输入。" );
								}
							}
							break;


						//主菜单：3、退出系统
						case "3":
							System.out.println( "正在退出系统。。。" );
							Thread.sleep( 1000 );
							System.out.println( "退出成功，再见。" );
							break mainw;
					}
				}else System.out.println("输入命令有误，请重新输入。");

			}

		}

	}
}
