package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("favskills")
public class SkillsController {

    @GetMapping("skills")
    public String autoMessage() {
       return "<html>" +
               "<body>" +
               "<h1>Skills Tracker</h1>" +
               "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
               "<ol>" +
               "<li>Java</li>" +
               "<li>JavaScript</li>" +
               "<li>Python</li>" +
               "</ol>" +
               "</body>" +
               "</html>";
   }

   @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
   public String updatedMessage(@RequestParam String name, @RequestParam String skill1, @RequestParam String skill2, @RequestParam String skill3) {
       return "<html>" +
               "<body>" +
               "<h1>" + name +
               "</h1>" +
               "<ol>" +
               "<li> " + skill1 +
               "</li>" +
               "<li>" + skill2 +
               "</li>" +
               "<li>" + skill3 +
               "</li>" +
               "</ol>" +
               "</body>" +
               "</html>";
   }


   @GetMapping("form")
    public String skillForm() {
       return "<html>" +
               "<body>" +
               "<form action='/favskills' method='post'>" +
               "<form action='' method=''>" +
               "<h3>Name: </h3>" +
               "<input type='text' name='name'" +
               "<h3>My favorite language</h3>" +
               "<select name = 'skill1'>" +
               "<option value='java'>Java</option>" +
               "<option value='javascript'>JavaScript</option>" +
               "<option value='java'>Python</option>" +
               "</select>" +
               "<h3>My Second favorite language</h3>" +
               "<select name = 'skill2'>" +
               "<option value='java'>Java</option>" +
               "<option value='javascript'>JavaScript</option>" +
               "<option value='java'>Python</option>" +
               "</select>" +
               "<select name = 'skill3'>" +
               "<option value='java'>Java</option>" +
               "<option value='javascript'>JavaScript</option>" +
               "<option value='java'>Python</option>" +
               "</select>" +
               "<input type='submit' value='submit'" +
               "</body>" +
               "</html>";
   }
}
