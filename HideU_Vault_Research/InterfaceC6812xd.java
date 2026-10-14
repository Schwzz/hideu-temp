package ambercore;

import ambercore.InterfaceC6707wd;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;
import org.apache.commons.lang3.ClassUtils;

/* JADX INFO: renamed from: ambercore.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC6812xd extends IInterface {
    public static final String OooO0Oo = "android$support$customtabs$ICustomTabsService".replace('$', ClassUtils.PACKAGE_SEPARATOR_CHAR);

    /* JADX INFO: renamed from: ambercore.xd$OooO00o */
    public static abstract class OooO00o extends Binder implements InterfaceC6812xd {
        static final int TRANSACTION_extraCommand = 5;
        static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
        static final int TRANSACTION_mayLaunchUrl = 4;
        static final int TRANSACTION_newSession = 3;
        static final int TRANSACTION_newSessionWithExtras = 10;
        static final int TRANSACTION_postMessage = 8;
        static final int TRANSACTION_receiveFile = 12;
        static final int TRANSACTION_requestPostMessageChannel = 7;
        static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
        static final int TRANSACTION_setEngagementSignalsCallback = 14;
        static final int TRANSACTION_updateVisuals = 6;
        static final int TRANSACTION_validateRelationship = 9;
        static final int TRANSACTION_warmup = 2;

        /* JADX INFO: renamed from: ambercore.xd$OooO00o$OooO00o, reason: collision with other inner class name */
        private static class C0060OooO00o implements InterfaceC6812xd {
            private IBinder OooOO0O;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.OooOO0O;
            }

            C0060OooO00o(IBinder iBinder) {
                this.OooOO0O = iBinder;
            }

            @Override // ambercore.InterfaceC6812xd
            public Bundle extraCommand(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6812xd.OooO0Oo);
                    parcelObtain.writeString(str);
                    OooO0O0.OooO0o(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) OooO0O0.OooO0Oo(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6812xd
            public boolean isEngagementSignalsApiAvailable(InterfaceC6707wd interfaceC6707wd, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6812xd.OooO0Oo);
                    parcelObtain.writeStrongInterface(interfaceC6707wd);
                    boolean z = false;
                    OooO0O0.OooO0o(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6812xd
            public boolean mayLaunchUrl(InterfaceC6707wd interfaceC6707wd, Uri uri, Bundle bundle, List list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6812xd.OooO0Oo);
                    parcelObtain.writeStrongInterface(interfaceC6707wd);
                    boolean z = false;
                    OooO0O0.OooO0o(parcelObtain, uri, 0);
                    OooO0O0.OooO0o(parcelObtain, bundle, 0);
                    OooO0O0.OooO0o0(parcelObtain, list, 0);
                    this.OooOO0O.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6812xd
            public boolean newSession(InterfaceC6707wd interfaceC6707wd) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6812xd.OooO0Oo);
                    parcelObtain.writeStrongInterface(interfaceC6707wd);
                    boolean z = false;
                    this.OooOO0O.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6812xd
            public boolean newSessionWithExtras(InterfaceC6707wd interfaceC6707wd, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6812xd.OooO0Oo);
                    parcelObtain.writeStrongInterface(interfaceC6707wd);
                    boolean z = false;
                    OooO0O0.OooO0o(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6812xd
            public int postMessage(InterfaceC6707wd interfaceC6707wd, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6812xd.OooO0Oo);
                    parcelObtain.writeStrongInterface(interfaceC6707wd);
                    parcelObtain.writeString(str);
                    OooO0O0.OooO0o(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6812xd
            public boolean receiveFile(InterfaceC6707wd interfaceC6707wd, Uri uri, int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6812xd.OooO0Oo);
                    parcelObtain.writeStrongInterface(interfaceC6707wd);
                    boolean z = false;
                    OooO0O0.OooO0o(parcelObtain, uri, 0);
                    parcelObtain.writeInt(i);
                    OooO0O0.OooO0o(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6812xd
            public boolean requestPostMessageChannel(InterfaceC6707wd interfaceC6707wd, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6812xd.OooO0Oo);
                    parcelObtain.writeStrongInterface(interfaceC6707wd);
                    boolean z = false;
                    OooO0O0.OooO0o(parcelObtain, uri, 0);
                    this.OooOO0O.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6812xd
            public boolean requestPostMessageChannelWithExtras(InterfaceC6707wd interfaceC6707wd, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6812xd.OooO0Oo);
                    parcelObtain.writeStrongInterface(interfaceC6707wd);
                    boolean z = false;
                    OooO0O0.OooO0o(parcelObtain, uri, 0);
                    OooO0O0.OooO0o(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6812xd
            public boolean setEngagementSignalsCallback(InterfaceC6707wd interfaceC6707wd, IBinder iBinder, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6812xd.OooO0Oo);
                    parcelObtain.writeStrongInterface(interfaceC6707wd);
                    parcelObtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    OooO0O0.OooO0o(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6812xd
            public boolean updateVisuals(InterfaceC6707wd interfaceC6707wd, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6812xd.OooO0Oo);
                    parcelObtain.writeStrongInterface(interfaceC6707wd);
                    boolean z = false;
                    OooO0O0.OooO0o(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6812xd
            public boolean validateRelationship(InterfaceC6707wd interfaceC6707wd, int i, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6812xd.OooO0Oo);
                    parcelObtain.writeStrongInterface(interfaceC6707wd);
                    parcelObtain.writeInt(i);
                    boolean z = false;
                    OooO0O0.OooO0o(parcelObtain, uri, 0);
                    OooO0O0.OooO0o(parcelObtain, bundle, 0);
                    this.OooOO0O.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ambercore.InterfaceC6812xd
            public boolean warmup(long j) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6812xd.OooO0Oo);
                    parcelObtain.writeLong(j);
                    boolean z = false;
                    this.OooOO0O.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
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

        public static InterfaceC6812xd asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC6812xd.OooO0Oo);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6812xd)) ? new C0060OooO00o(iBinder) : (InterfaceC6812xd) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC6812xd.OooO0Oo;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    boolean zWarmup = warmup(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zWarmup ? 1 : 0);
                    return true;
                case 3:
                    boolean zNewSession = newSession(InterfaceC6707wd.OooO00o.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zNewSession ? 1 : 0);
                    return true;
                case 4:
                    InterfaceC6707wd interfaceC6707wdAsInterface = InterfaceC6707wd.OooO00o.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) OooO0O0.OooO0Oo(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zMayLaunchUrl = mayLaunchUrl(interfaceC6707wdAsInterface, uri, (Bundle) OooO0O0.OooO0Oo(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMayLaunchUrl ? 1 : 0);
                    return true;
                case 5:
                    Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) OooO0O0.OooO0Oo(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    OooO0O0.OooO0o(parcel2, bundleExtraCommand, 1);
                    return true;
                case 6:
                    boolean zUpdateVisuals = updateVisuals(InterfaceC6707wd.OooO00o.asInterface(parcel.readStrongBinder()), (Bundle) OooO0O0.OooO0Oo(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateVisuals ? 1 : 0);
                    return true;
                case 7:
                    boolean zRequestPostMessageChannel = requestPostMessageChannel(InterfaceC6707wd.OooO00o.asInterface(parcel.readStrongBinder()), (Uri) OooO0O0.OooO0Oo(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestPostMessageChannel ? 1 : 0);
                    return true;
                case 8:
                    int iPostMessage = postMessage(InterfaceC6707wd.OooO00o.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) OooO0O0.OooO0Oo(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iPostMessage);
                    return true;
                case 9:
                    boolean zValidateRelationship = validateRelationship(InterfaceC6707wd.OooO00o.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) OooO0O0.OooO0Oo(parcel, Uri.CREATOR), (Bundle) OooO0O0.OooO0Oo(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zValidateRelationship ? 1 : 0);
                    return true;
                case 10:
                    boolean zNewSessionWithExtras = newSessionWithExtras(InterfaceC6707wd.OooO00o.asInterface(parcel.readStrongBinder()), (Bundle) OooO0O0.OooO0Oo(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zNewSessionWithExtras ? 1 : 0);
                    return true;
                case 11:
                    boolean zRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(InterfaceC6707wd.OooO00o.asInterface(parcel.readStrongBinder()), (Uri) OooO0O0.OooO0Oo(parcel, Uri.CREATOR), (Bundle) OooO0O0.OooO0Oo(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestPostMessageChannelWithExtras ? 1 : 0);
                    return true;
                case 12:
                    boolean zReceiveFile = receiveFile(InterfaceC6707wd.OooO00o.asInterface(parcel.readStrongBinder()), (Uri) OooO0O0.OooO0Oo(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) OooO0O0.OooO0Oo(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zReceiveFile ? 1 : 0);
                    return true;
                case 13:
                    boolean zIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(InterfaceC6707wd.OooO00o.asInterface(parcel.readStrongBinder()), (Bundle) OooO0O0.OooO0Oo(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsEngagementSignalsApiAvailable ? 1 : 0);
                    return true;
                case 14:
                    boolean engagementSignalsCallback = setEngagementSignalsCallback(InterfaceC6707wd.OooO00o.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) OooO0O0.OooO0Oo(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        public OooO00o() {
            attachInterface(this, InterfaceC6812xd.OooO0Oo);
        }
    }

    /* JADX INFO: renamed from: ambercore.xd$OooO0O0 */
    public static class OooO0O0 {
        /* JADX INFO: Access modifiers changed from: private */
        public static void OooO0o(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void OooO0o0(Parcel parcel, List list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                OooO0o(parcel, (Parcelable) list.get(i2), i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Object OooO0Oo(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    Bundle extraCommand(String str, Bundle bundle);

    boolean isEngagementSignalsApiAvailable(InterfaceC6707wd interfaceC6707wd, Bundle bundle);

    boolean mayLaunchUrl(InterfaceC6707wd interfaceC6707wd, Uri uri, Bundle bundle, List list);

    boolean newSession(InterfaceC6707wd interfaceC6707wd);

    boolean newSessionWithExtras(InterfaceC6707wd interfaceC6707wd, Bundle bundle);

    int postMessage(InterfaceC6707wd interfaceC6707wd, String str, Bundle bundle);

    boolean receiveFile(InterfaceC6707wd interfaceC6707wd, Uri uri, int i, Bundle bundle);

    boolean requestPostMessageChannel(InterfaceC6707wd interfaceC6707wd, Uri uri);

    boolean requestPostMessageChannelWithExtras(InterfaceC6707wd interfaceC6707wd, Uri uri, Bundle bundle);

    boolean setEngagementSignalsCallback(InterfaceC6707wd interfaceC6707wd, IBinder iBinder, Bundle bundle);

    boolean updateVisuals(InterfaceC6707wd interfaceC6707wd, Bundle bundle);

    boolean validateRelationship(InterfaceC6707wd interfaceC6707wd, int i, Uri uri, Bundle bundle);

    boolean warmup(long j);
}
