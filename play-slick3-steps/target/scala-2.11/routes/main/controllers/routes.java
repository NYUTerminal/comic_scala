
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/MeanMachine/Desktop/x.ai/play-slick3-steps/conf/routes
// @DATE:Sat Aug 06 17:41:18 EDT 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseSubscriptionController SubscriptionController = new controllers.ReverseSubscriptionController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseComicController ComicController = new controllers.ReverseComicController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseSubscriptionController SubscriptionController = new controllers.javascript.ReverseSubscriptionController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseComicController ComicController = new controllers.javascript.ReverseComicController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
  }

}
