package ambercore;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import org.apache.commons.lang3.ClassUtils;

/* JADX INFO: renamed from: ambercore.wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC6707wd extends IInterface {
    public static final String OooO0OO = "android$support$customtabs$ICustomTabsCallback".replace('$', ClassUtils.PACKAGE_SEPARATOR_CHAR);

    /* JADX INFO: renamed from: ambercore.wd$OooO00o */
    public static abstract class OooO00o extends Binder implements InterfaceC6707wd {
        static final int TRANSACTION_extraCallback = 3;
        static final int TRANSACTION_extraCallbackWithResult = 7;
        static final int TRANSACTION_onActivityLayout = 10;
        static final int TRANSACTION_onActivityResized = 8;
        static final int TRANSACTION_onMessageChannelReady = 4;
        static final int TRANSACTION_onMinimized = 11;
        static final int TRANSACTION_onNavigationEvent = 2;
        static final int TRANSACTION_onPostMessage = 5;
        static final int TRANSACTION_onRelationshipValidationResult = 6;
        static final int TRANSACTION_onUnminimized = 12;
        static final int TRANSACTION_onWarmupCompleted = 9;

        /* JADX INFO: renamed from: ambercore.wd$OooO00o$OooO00o, reason: collision with other inner class name */
        private static class C0059OooO00o implements InterfaceC6707wd {
            private IBinder OooOO0O;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.OooOO0O;
            }

            C0059OooO00o(IBinder iBinder) {
                this.OooOO0O = iBinder;
            }

            @Override // ambercore.InterfaceC6707wd
            public void extraCallback(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6707wd.OooO0OO);
                    parcelObtain.writeString(str);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6707wd
            public Bundle extraCallbackWithResult(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6707wd.OooO0OO);
                    parcelObtain.writeString(str);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) OooO0O0.OooO0OO(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6707wd
            public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6707wd.OooO0OO);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(i5);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6707wd
            public void onActivityResized(int i, int i2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6707wd.OooO0OO);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6707wd
            public void onMessageChannelReady(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6707wd.OooO0OO);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6707wd
            public void onMinimized(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6707wd.OooO0OO);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6707wd
            public void onNavigationEvent(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6707wd.OooO0OO);
                    parcelObtain.writeInt(i);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6707wd
            public void onPostMessage(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6707wd.OooO0OO);
                    parcelObtain.writeString(str);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6707wd
            public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6707wd.OooO0OO);
                    parcelObtain.writeInt(i);
                    OooO0O0.OooO0Oo(parcelObtain, uri, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6707wd
            public void onUnminimized(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6707wd.OooO0OO);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6707wd
            public void onWarmupCompleted(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6707wd.OooO0OO);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static InterfaceC6707wd asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC6707wd.OooO0OO);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6707wd)) ? new C0059OooO00o(iBinder) : (InterfaceC6707wd) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC6707wd.OooO0OO;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    onNavigationEvent(parcel.readInt(), (Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    extraCallback(parcel.readString(), (Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    onMessageChannelReady((Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onPostMessage(parcel.readString(), (Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onRelationshipValidationResult(parcel.readInt(), (Uri) OooO0O0.OooO0OO(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleExtraCallbackWithResult = extraCallbackWithResult(parcel.readString(), (Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    OooO0O0.OooO0Oo(parcel2, bundleExtraCallbackWithResult, 1);
                    return true;
                case 8:
                    onActivityResized(parcel.readInt(), parcel.readInt(), (Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    onWarmupCompleted((Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    onActivityLayout(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    onMinimized((Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    onUnminimized((Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        public OooO00o() {
            attachInterface(this, InterfaceC6707wd.OooO0OO);
        }
    }

    /* JADX INFO: renamed from: ambercore.wd$OooO0O0 */
    public static class OooO0O0 {
        /* JADX INFO: Access modifiers changed from: private */
        public static void OooO0Oo(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Object OooO0OO(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void extraCallback(String str, Bundle bundle);

    Bundle extraCallbackWithResult(String str, Bundle bundle);

    void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle);

    void onActivityResized(int i, int i2, Bundle bundle);

    void onMessageChannelReady(Bundle bundle);

    void onMinimized(Bundle bundle);

    void onNavigationEvent(int i, Bundle bundle);

    void onPostMessage(String str, Bundle bundle);

    void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle);

    void onUnminimized(Bundle bundle);

    void onWarmupCompleted(Bundle bundle);
}
