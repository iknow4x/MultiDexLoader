package accd.android.bundle.config;

import java.util.ArrayList;
import java.util.List;

public class BundleConfigFactory {

    private static final List<BundleConfigModel> bundleConfigModels;

    static {
        bundleConfigModels = new ArrayList<BundleConfigModel>();

        //========================AutoLoad Begin========================
        //PublicProduct
        bundleConfigModels.add(new BundleConfigModel(
                "home",
                "ctrip.android.publicproduct",
                "ctrip.android.publicproduct.home.bus.HomeBusObject",
                BundleConfigModel.BundleLoadType.AutoLoad,
                true
        ));

        //PublicProduct
        bundleConfigModels.add(new BundleConfigModel(
                "feedback",
                "ctrip.android.publicproduct",
                "ctrip.android.publicproduct.feedback.bus.FeedbackBusObject",
                BundleConfigModel.BundleLoadType.AutoLoad,
                true
        ));

        //PublicProduct
        bundleConfigModels.add(new BundleConfigModel(
                "zeroflow",
                "ctrip.android.publicproduct",
                "ctrip.android.publicproduct.zeroflow.bus.ZeroflowBusObject",
                BundleConfigModel.BundleLoadType.AutoLoad,
                true
        ));

        /**--  酒店Module config begin --**/

        //酒店
        bundleConfigModels.add(new BundleConfigModel(
                "hotel",
                "ctrip.android.hotel",
                "ctrip.android.hotel.bus.HotelBusObject",
                BundleConfigModel.BundleLoadType.AutoLoad,
                true
        ));

        //机票
        bundleConfigModels.add(new BundleConfigModel(
                "flight",
                "ctrip.android.flight",
                "ctrip.android.flight.bus.FlightBusObject",
                BundleConfigModel.BundleLoadType.AutoLoad, true
        ));

        //========================AutoLoad End========================
        //========================LazyLoad 1th Begin========================

        //火车票
        bundleConfigModels.add(new BundleConfigModel(
                "train",
                "ctrip.android.train",
                "ctrip.android.train.business.bus.TrainBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad, true, true
        ));

        //旅行日程
        bundleConfigModels.add(new BundleConfigModel(
                "schedule",
                "ctrip.android.schedule",
                "ctrip.android.schedule.ScheduleBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad,
                true,
                true
        ));


        //客服
        bundleConfigModels.add(new BundleConfigModel(
                "customerservice",
                "ctrip.android.customerservice",
                "ctrip.android.customerservice.livechat.common.CTCSBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad,
                false,
                true
        ));

        //我携
        bundleConfigModels.add(new BundleConfigModel(
                "myctrip",
                "ctrip.android.myctrip",
                "ctrip.android.view.myctrip.MyCtripBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad,
                false,
                true
        ));

        //========================LazyLoad 1th End========================

        //酒店点评
        bundleConfigModels.add(new BundleConfigModel(
                "hotel_comment",
                "ctrip.android.hotel.comment",
                "ctrip.android.hotel.comment.HotelCommentBus",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        //酒店入住人
        bundleConfigModels.add(new BundleConfigModel(
                "hotel_passenger",
                "ctrip.android.hotel.passenger",
                "ctrip.android.hotel.passenger.HotelPassengerBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        //酒店地图
        bundleConfigModels.add(new BundleConfigModel(
                "hotel_map",
                "ctrip.android.hotel.map",
                "ctrip.android.hotel.map.HotelMapBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        //酒店订单
        bundleConfigModels.add(new BundleConfigModel(
                "hotel_order",
                "ctrip.android.hotel.order",
                "ctrip.android.hotel.order.HotelOrderBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        //酒店详情
        bundleConfigModels.add(new BundleConfigModel(
                "hotel_detail",
                "ctrip.android.hotel.detail",
                "ctrip.android.hotel.detail.HotelDetailBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        //酒店工具类
        bundleConfigModels.add(new BundleConfigModel(
                "hotel_tool",
                "ctrip.android.hotel.tool",
                "ctrip.android.hotel.tool.HotelToolBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));


        /**--  酒店Module config end --**/

        //机票配送
        bundleConfigModels.add(new BundleConfigModel(
                "flightDispatch",
                "ctrip.android.flight.dispatch",
                "ctrip.android.flight.dispatch.common.bus.FlightDispatchBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad, true
        ));
        //机票用车(接送机)
        bundleConfigModels.add(new BundleConfigModel(
                "flightUseCar",
                "ctrip.android.flight.usecar",
                "ctrip.android.flight.usecar.common.FlightUseCarBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad, true
        ));
        // 机票乘机人
        bundleConfigModels.add(new BundleConfigModel(
                "flightPassenger",
                "ctrip.android.flight.passenger",
                "ctrip.android.flight.passenger.common.bus.FlightPassengerBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad, true
        ));

        bundleConfigModels.add(new BundleConfigModel(
                "train_part",
                "ctrip.android.train.part",
                "ctrip.android.train.part.TrainPartBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));
        //攻略-口袋攻略
        bundleConfigModels.add(new BundleConfigModel(
                "destinationstrategy",
                "ctrip.android.destination.strategy",
                "ctrip.android.destination.strategy.DestinationStrategyBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad));

        //攻略-嘻游
        bundleConfigModels.add(new BundleConfigModel(
                "destination_story",
                "ctrip.android.destination.story",
                "ctrip.android.destination.story.DestinationStoryBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        bundleConfigModels.add(new BundleConfigModel(
                "ctsJan",
                "ctrip.android.schedule.jan",
                "ctrip.android.schedule.jan.ScheduleBusObjectJan",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        //VOIP电话
        bundleConfigModels.add(new BundleConfigModel(
                "call",
                "ctrip.android.call",
                "ctrip.android.call.CallBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        //搜索
        bundleConfigModels.add(new BundleConfigModel(
                "search",
                "ctrip.android.search",
                "ctrip.android.search.SearchBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));


        //攻略
        bundleConfigModels.add(new BundleConfigModel(
                "destination",
                "ctrip.android.destination",
                "ctrip.android.destination.view.DestinationBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad, true, true
        ));

        //攻略-游记
        bundleConfigModels.add(new BundleConfigModel(
                "destinationtrnote",
                "ctrip.android.destination.travels",
                "ctrip.android.destination.travels.DestinationTrNoteBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        //攻略-日程
        bundleConfigModels.add(new BundleConfigModel(
                "destinationschedule",
                "ctrip.android.destination.schedule",
                "ctrip.android.destination.schedule.DestinationScheduleBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        //语音
        bundleConfigModels.add(new BundleConfigModel(
                "voice",
                "ctrip.android.voice",
                "ctrip.android.voice.VoiceBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        //聊天
        bundleConfigModels.add(new BundleConfigModel(
                "chat",
                "ctrip.android.chat",
                "ctrip.android.chat.ChatBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad,
                false,
                true
        ));

        //支付
        bundleConfigModels.add(new BundleConfigModel(
                "payment",
                "ctrip.android.pay",
                "ctrip.android.pay.view.bus.PaymentBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad,
                false,
                true
        ));

        //登陆
        bundleConfigModels.add(new BundleConfigModel(
                "login",
                "ctrip.android.login",
                "ctrip.android.login.bus.LoginBusObject",
                BundleConfigModel.BundleLoadType.AutoLoad
        ));


        //翻译助手
        bundleConfigModels.add(new BundleConfigModel(
                "translator",
                "ctrip.android.translator",
                "ctrip.android.translator.bus.TransBusObject",
                BundleConfigModel.BundleLoadType.RemoteLoad
        ));

        //二维码
        bundleConfigModels.add(new BundleConfigModel(
                "qrcode",
                "ctrip.android.qrcode",
                "ctrip.android.qrcode.QRCodeBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

//        //webdav
        bundleConfigModels.add(new BundleConfigModel(
                "webdav",
                "ctrip.android.webdav",
                "ctrip.android.webdav.WebDAVBusObject",
                BundleConfigModel.BundleLoadType.RemoteLoad
        ));

//        //debug
        bundleConfigModels.add(new BundleConfigModel(
                "debug",
                "ctrip.android.debug",
                "ctrip.android.debug.DebugBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        //度假
        bundleConfigModels.add(new BundleConfigModel(
                "tour",
                "ctrip.android.tour",
                "ctrip.android.tour.bus.TourBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        //      //PersonInfo
        bundleConfigModels.add(new BundleConfigModel(
                "personinfo",
                "ctrip.android.personinfo",
                "ctrip.android.personinfo.PersonInfoBusObject",
                BundleConfigModel.BundleLoadType.AutoLoad
        ));

        //ReactNative
        bundleConfigModels.add(new BundleConfigModel(
                "reactnative",
                "ctrip.android.reactnative",
                "ctrip.android.reactnative.bus.CRNBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad, false, true
        ));

        //AR
        bundleConfigModels.add(new BundleConfigModel(
                "ctripar",
                "ctrip.android.ar",
                "ctrip.android.ar.bus.ARBusObject",
                BundleConfigModel.BundleLoadType.LazyLoad
        ));

        // IMKit
        bundleConfigModels.add(new BundleConfigModel(
                "imkit",
                "ctrip.android.imkit",
                "ctrip.android.imkit.IMKitBusObject",
                BundleConfigModel.BundleLoadType.AutoLoad
        ));
    }

    public static List<BundleConfigModel> getBundleConfigModels() {
        return bundleConfigModels;
    }

    public static BundleConfigModel getBundleConfigModelByModuleName(String moduleName) {

        for (BundleConfigModel bundleConfigModel : bundleConfigModels) {
            if (bundleConfigModel.moduleName.equalsIgnoreCase(moduleName)) {
                return bundleConfigModel;
            }
        }
        return null;
    }

    public static List<BundleConfigModel> getLocalLoadBundleConfigModels() {

        List<BundleConfigModel> bundlesModles = new ArrayList<BundleConfigModel>();
        for (BundleConfigModel bundleConfigModel : bundleConfigModels) {
            if (bundleConfigModel.bundleLoadType != BundleConfigModel.BundleLoadType.RemoteLoad) {
                bundlesModles.add(bundleConfigModel);
            }
        }
        return bundlesModles;
    }

    public static List<BundleConfigModel> getLazyLoadInBackgroundConfigModels(){
        List<BundleConfigModel> bundlesModles = new ArrayList<BundleConfigModel>();
        for (BundleConfigModel bundleConfigModel : bundleConfigModels) {
            if (bundleConfigModel.bundleLoadType == BundleConfigModel.BundleLoadType.LazyLoad && bundleConfigModel.isLoadInBackground) {
                bundlesModles.add(bundleConfigModel);
            }
        }
        return bundlesModles;
    }

    public static boolean isDelayLoadBundle(String packageName) {
        for (BundleConfigModel bundleConfigModel : bundleConfigModels) {
            if (bundleConfigModel.packageName.equals(packageName) && bundleConfigModel.bundleLoadType == BundleConfigModel.BundleLoadType.LazyLoad) {
                return true;
            }
        }
        return false;
    }

    public static List<BundleConfigModel> getDelayLoadBundle() {
        List<BundleConfigModel> bundlesModles = new ArrayList<BundleConfigModel>();
        for (BundleConfigModel bundleConfigModel : bundleConfigModels) {
            if (bundleConfigModel.bundleLoadType == BundleConfigModel.BundleLoadType.LazyLoad) {
                bundlesModles.add(bundleConfigModel);
            }
        }
        return bundlesModles;
    }
}
