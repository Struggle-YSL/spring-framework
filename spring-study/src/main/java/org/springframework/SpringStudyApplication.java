package org.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.service.AppConfig;
import org.springframework.test.service.UserService;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class SpringStudyApplication {
	public static void main(String[] args) {
		//TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
		// 查看 IntelliJ IDEA 建议如何修正。
		System.out.printf("Hello and welcome!");

		for (int i = 1; i <= 5; i++) {
			//TIP 按 <shortcut actionId="Debug"/> 开始调试代码。我们已经设置了一个 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 断点
			// 但您始终可以通过按 <shortcut actionId="ToggleLineBreakpoint"/> 添加更多断点。
			System.out.println("i = " + i);
		}

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService.getOrderService());
	}
}