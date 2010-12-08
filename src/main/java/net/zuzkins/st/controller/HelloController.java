package net.zuzkins.st.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * User: zuzkins
 */
@Controller
public class HelloController {

	@RequestMapping(value = "/hello/{user}", method = RequestMethod.POST)
	@ResponseBody
	public Resource append(@PathVariable String user, @RequestBody Resource res) {
		return new Resource("Hello " + user + ". You said: \"" + res.getContents() + "\"");
	}

	public static class Resource {
		private String contents;

		public Resource(String contents) {
			this.contents = contents;
		}

		public Resource() {
		}

		public String getContents() {
			return contents;
		}

		public void setContents(String contents) {
			this.contents = contents;
		}
	}
}
