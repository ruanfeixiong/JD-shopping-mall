package top.linsir.jd_shopping_mall.ui.root.contract;

import android.content.Context;

import jd_shopping_mall.linsir.top.anno.InstanceFactory;
import top.linsir.jd_shopping_mall.base.BaseModel;
import top.linsir.jd_shopping_mall.base.BasePresenter;
import top.linsir.jd_shopping_mall.base.BaseView;
import top.linsir.jd_shopping_mall.base.rxbase.RxPermissions;

/**
 * 作者：潇湘夜雨 on 2018/1/29.
 * 邮箱：879689064@qq.com
 */

public interface RootContract {
    interface Model extends BaseModel {

    }

    interface View extends BaseView {

        void setIndexTab(int index);
    }

    abstract static class Presenter extends BasePresenter<RootContract.Model,RootContract.View> {
        public abstract void checkPermissions(RxPermissions rxPermissions);

        public abstract android.view.View getView(Context context, int i);

    }
}
