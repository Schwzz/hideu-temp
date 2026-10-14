package ambercore;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import org.apache.commons.lang3.ClassUtils;

/* JADX INFO: renamed from: ambercore.Je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC1232Je extends IInterface {
    public static final String OooO0oo = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', ClassUtils.PACKAGE_SEPARATOR_CHAR);

    /* JADX INFO: renamed from: ambercore.Je$OooO00o */
    public static abstract class OooO00o extends Binder implements InterfaceC1232Je {
        static final int TRANSACTION_areNotificationsEnabled = 6;
        static final int TRANSACTION_cancelNotification = 3;
        static final int TRANSACTION_extraCommand = 9;
        static final int TRANSACTION_getActiveNotifications = 5;
        static final int TRANSACTION_getSmallIconBitmap = 7;
        static final int TRANSACTION_getSmallIconId = 4;
        static final int TRANSACTION_notifyNotificationWithChannel = 2;

        /* JADX INFO: renamed from: ambercore.Je$OooO00o$OooO00o, reason: collision with other inner class name */
        private static class C0010OooO00o implements InterfaceC1232Je {
            private IBinder OooOO0O;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.OooOO0O;
            }

            C0010OooO00o(IBinder iBinder) {
                this.OooOO0O = iBinder;
            }

            @Override // ambercore.InterfaceC1232Je
            public Bundle areNotificationsEnabled(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1232Je.OooO0oo);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) OooO0O0.OooO0OO(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC1232Je
            public void cancelNotification(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1232Je.OooO0oo);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC1232Je
            public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1232Je.OooO0oo);
                    parcelObtain.writeString(str);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.OooOO0O.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) OooO0O0.OooO0OO(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC1232Je
            public Bundle getActiveNotifications() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1232Je.OooO0oo);
                    this.OooOO0O.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) OooO0O0.OooO0OO(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC1232Je
            public Bundle getSmallIconBitmap() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1232Je.OooO0oo);
                    this.OooOO0O.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) OooO0O0.OooO0OO(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC1232Je
            public int getSmallIconId() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1232Je.OooO0oo);
                    this.OooOO0O.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC1232Je
            public Bundle notifyNotificationWithChannel(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1232Je.OooO0oo);
                    OooO0O0.OooO0Oo(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) OooO0O0.OooO0OO(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static InterfaceC1232Je asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1232Je.OooO0oo);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1232Je)) ? new C0010OooO00o(iBinder) : (InterfaceC1232Je) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC1232Je.OooO0oo;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    Bundle bundleNotifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    OooO0O0.OooO0Oo(parcel2, bundleNotifyNotificationWithChannel, 1);
                    return true;
                case 3:
                    cancelNotification((Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int smallIconId = getSmallIconId();
                    parcel2.writeNoException();
                    parcel2.writeInt(smallIconId);
                    return true;
                case 5:
                    Bundle activeNotifications = getActiveNotifications();
                    parcel2.writeNoException();
                    OooO0O0.OooO0Oo(parcel2, activeNotifications, 1);
                    return true;
                case 6:
                    Bundle bundleAreNotificationsEnabled = areNotificationsEnabled((Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    OooO0O0.OooO0Oo(parcel2, bundleAreNotificationsEnabled, 1);
                    return true;
                case 7:
                    Bundle smallIconBitmap = getSmallIconBitmap();
                    parcel2.writeNoException();
                    OooO0O0.OooO0Oo(parcel2, smallIconBitmap, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case 9:
                    Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) OooO0O0.OooO0OO(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    OooO0O0.OooO0Oo(parcel2, bundleExtraCommand, 1);
                    return true;
            }
        }

        public OooO00o() {
            attachInterface(this, InterfaceC1232Je.OooO0oo);
        }
    }

    /* JADX INFO: renamed from: ambercore.Je$OooO0O0 */
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

    Bundle areNotificationsEnabled(Bundle bundle);

    void cancelNotification(Bundle bundle);

    Bundle extraCommand(String str, Bundle bundle, IBinder iBinder);

    Bundle getActiveNotifications();

    Bundle getSmallIconBitmap();

    int getSmallIconId();

    Bundle notifyNotificationWithChannel(Bundle bundle);
}
