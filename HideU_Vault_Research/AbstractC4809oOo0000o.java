package ambercore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: ambercore.oOo0000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4809oOo0000o extends OOO0000 {
    public static /* synthetic */ List OooO(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C4687oOOOoOOo.OooO0O0;
        }
        return OooO0oo(file, charset);
    }

    public static void OooO0Oo(File file, byte[] array) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            C7028ze0 c7028ze0 = C7028ze0.OooO00o;
            AbstractC4751oOOoOOOO.OooO00o(fileOutputStream, null);
        } finally {
        }
    }

    public static final void OooO0o(File file, Charset charset, L2 action) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        J70.OooO0OO(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static final ByteBuffer OooO0o0(int i, CharsetEncoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i * ((int) Math.ceil(encoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final CharsetEncoder OooO0oO(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static final List OooO0oo(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        OooO0o(file, charset, new L2() { // from class: ambercore.oOo00000
            @Override // ambercore.L2
            public final Object invoke(Object obj) {
                return AbstractC4809oOo0000o.OooOO0(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7028ze0 OooOO0(ArrayList arrayList, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        arrayList.add(it);
        return C7028ze0.OooO00o;
    }

    public static final String OooOO0O(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strOooO0o0 = J70.OooO0o0(inputStreamReader);
            AbstractC4751oOOoOOOO.OooO00o(inputStreamReader, null);
            return strOooO0o0;
        } finally {
        }
    }

    public static /* synthetic */ String OooOO0o(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C4687oOOOoOOo.OooO0O0;
        }
        return OooOO0O(file, charset);
    }

    public static void OooOOO(File file, String text, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            OooOOOo(fileOutputStream, text, charset);
            C7028ze0 c7028ze0 = C7028ze0.OooO00o;
            AbstractC4751oOOoOOOO.OooO00o(fileOutputStream, null);
        } finally {
        }
    }

    public static void OooOOO0(File file, byte[] array) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            C7028ze0 c7028ze0 = C7028ze0.OooO00o;
            AbstractC4751oOOoOOOO.OooO00o(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void OooOOOO(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C4687oOOOoOOo.OooO0O0;
        }
        OooOOO(file, str, charset);
    }

    public static final void OooOOOo(OutputStream outputStream, String text, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderOooO0oO = OooO0oO(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        Intrinsics.checkNotNull(charsetEncoderOooO0oO);
        ByteBuffer byteBufferOooO0o0 = OooO0o0(8192, charsetEncoderOooO0oO);
        int i = 0;
        int i2 = 0;
        while (i < text.length()) {
            int iMin = Math.min(8192 - i2, text.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            Intrinsics.checkNotNullExpressionValue(cArrArray, "array(...)");
            text.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOooO0oO.encode(charBufferAllocate, byteBufferOooO0o0, i3 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferOooO0o0.array(), 0, byteBufferOooO0o0.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferOooO0o0.clear();
            i = i3;
        }
    }
}
