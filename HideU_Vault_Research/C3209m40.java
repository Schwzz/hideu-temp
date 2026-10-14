package ambercore;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ambercore.m40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C3209m40 extends AbstractC5882oq {
    private static final UriMatcher OooOOO;

    private InputStream OooOO0(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        OooOOO = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    private InputStream OooO(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = OooOOO.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return OooOO0(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return OooOO0(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    @Override // ambercore.InterfaceC5195oo0O0oo0
    public Class OooO00o() {
        return InputStream.class;
    }

    public C3209m40(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ambercore.AbstractC5882oq
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public void OooO0Oo(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ambercore.AbstractC5882oq
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public InputStream OooO0o0(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamOooO = OooO(uri, contentResolver);
        if (inputStreamOooO != null) {
            return inputStreamOooO;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
