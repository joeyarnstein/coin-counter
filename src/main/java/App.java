
import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {

    String layout = "templates/layout.vtl";

    get("/", (req,res) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine() );


    get("/results", (req,res) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/results.vtl");

      String inCents = req.queryParams("inCents");

      String outMoney = CountCount.CountCents(inCents);


      model.put("outMoney", outMoney);
      return new ModelAndView(model, layout);

    }, new VelocityTemplateEngine() );
  }

}
