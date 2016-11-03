package controllers;

import io.swagger.annotations.*;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
// */
@Api(value = "首页", description = "接口说明")
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     *
     */
    @ApiOperation(
            nickname = "index",
            value = "index页面",
            notes = "Your new application is ready.",
            response = Result.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success"),
            @ApiResponse(code = 404, message = "Pet not found"),
            @ApiResponse(code = 500, message = "Internal server error")})
    public Result index() {
        return ok(views.html.index.render("Your new application is ready."));
    }

    @ApiOperation(
            nickname = "hello",
            value = "这里是接口描述",
            notes = "sayHello")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success"),
            @ApiResponse(code = 404, message = "Pet not found"),
            @ApiResponse(code = 500, message = "Internal server error")})
    @ApiImplicitParams(value = {
            @ApiImplicitParam(
                    name = "body",
                    value = "传入的json分组格式",
                    dataType = "application/json",
                    paramType = "body",
                    defaultValue ="{}")})
    public Result hello() {
        return ok(request().body().asJson());
    }

}
