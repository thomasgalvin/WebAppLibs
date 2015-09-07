package weblib;

import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;

public class WebLibs
{
    public static final String CONTEXT_ROOT_ACE= "/ace";
    public static final String CONTEXT_ROOT_ANGULAR = "/ng";
    public static final String CONTEXT_ROOT_ANGULAR_UI_TREE = "/ng-ui-tree";
    public static final String CONTEXT_ROOT_BOOTSTRAP = "/bootstrap";
    public static final String CONTEXT_ROOT_UI_BOOTSTRAP = "/ui-bootstrap";
    public static final String CONTEXT_ROOT_JQUERY = "/jquery";
    public static final String CONTEXT_ROOT_IMG_COMMON = "/img-common";
    public static final String CONTEXT_ROOT_SKELETON = "/skeleton";
    
    public static void registerAssetBundles( Bootstrap bootstrap ) {
        bootstrap.addBundle( new AssetsBundle( "/ace/1.1.9", CONTEXT_ROOT_ACE, "", "weblib-ace" ) );
        bootstrap.addBundle( new AssetsBundle( "/angular/1.4.2", CONTEXT_ROOT_ANGULAR, "", "weblib-angular" ) );
        bootstrap.addBundle( new AssetsBundle( "/angular-ui-tree/2.0", CONTEXT_ROOT_ANGULAR_UI_TREE, "", "weblib-angular-ui-tree" ) );
        bootstrap.addBundle( new AssetsBundle( "/bootstrap/3.3.5", CONTEXT_ROOT_BOOTSTRAP, "", "weblib-bootstrap" ) );
        bootstrap.addBundle( new AssetsBundle( "/ui-bootstrap/0.13.0", CONTEXT_ROOT_UI_BOOTSTRAP, "", "weblib-bootstrap-ui" ) );
        bootstrap.addBundle( new AssetsBundle( "/jQuery/2.1.3", CONTEXT_ROOT_JQUERY, "", "weblib-jquery" ) );
        bootstrap.addBundle( new AssetsBundle( "/img-common", CONTEXT_ROOT_IMG_COMMON, "", "weblib-img-common" ) );
        bootstrap.addBundle( new AssetsBundle( "/skeleton/2.0.4", CONTEXT_ROOT_SKELETON, "", "weblib-skeleton" ) );
    }
}
