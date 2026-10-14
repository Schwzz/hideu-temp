package ambercore;

import android.os.Build;
import android.os.StrictMode;
import com.ironsource.C10285d4;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: renamed from: ambercore.ooO0oOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5450ooO0oOOO implements Closeable, AutoCloseable {
    private final File OooOO0O;
    private final File OooOO0o;
    private final File OooOOO;
    private final File OooOOO0;
    private final int OooOOOO;
    private long OooOOOo;
    private final int OooOOo0;
    private Writer OooOOoo;
    private int OooOo0;
    private long OooOOo = 0;
    private final LinkedHashMap OooOo00 = new LinkedHashMap(0, 0.75f, true);
    private long OooOo0O = 0;
    final ThreadPoolExecutor OooOo0o = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new OooO0O0(null));
    private final Callable OooOo = new OooO00o();

    /* JADX INFO: renamed from: ambercore.ooO0oOOO$OooO00o */
    class OooO00o implements Callable {
        OooO00o() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C5450ooO0oOOO.this) {
                try {
                    if (C5450ooO0oOOO.this.OooOOoo == null) {
                        return null;
                    }
                    C5450ooO0oOOO.this.Oooo00o();
                    if (C5450ooO0oOOO.this.OooOoO0()) {
                        C5450ooO0oOOO.this.OooOooo();
                        C5450ooO0oOOO.this.OooOo0 = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.ooO0oOOO$OooO0O0 */
    private static final class OooO0O0 implements ThreadFactory {
        private OooO0O0() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ OooO0O0(OooO00o oooO00o) {
            this();
        }
    }

    /* JADX INFO: renamed from: ambercore.ooO0oOOO$OooO0OO */
    public final class OooO0OO {
        private final C5451OooO0Oo OooO00o;
        private final boolean[] OooO0O0;
        private boolean OooO0OO;

        /* synthetic */ OooO0OO(C5450ooO0oOOO c5450ooO0oOOO, C5451OooO0Oo c5451OooO0Oo, OooO00o oooO00o) {
            this(c5451OooO0Oo);
        }

        private OooO0OO(C5451OooO0Oo c5451OooO0Oo) {
            this.OooO00o = c5451OooO0Oo;
            this.OooO0O0 = c5451OooO0Oo.OooO0o0 ? null : new boolean[C5450ooO0oOOO.this.OooOOo0];
        }

        public void OooO00o() {
            C5450ooO0oOOO.this.OooOOOo(this, false);
        }

        public void OooO0O0() {
            if (this.OooO0OO) {
                return;
            }
            try {
                OooO00o();
            } catch (IOException unused) {
            }
        }

        public File OooO0o(int i) {
            File fileOooOO0O;
            synchronized (C5450ooO0oOOO.this) {
                try {
                    if (this.OooO00o.OooO0o != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.OooO00o.OooO0o0) {
                        this.OooO0O0[i] = true;
                    }
                    fileOooOO0O = this.OooO00o.OooOO0O(i);
                    C5450ooO0oOOO.this.OooOO0O.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileOooOO0O;
        }

        public void OooO0o0() {
            C5450ooO0oOOO.this.OooOOOo(this, true);
            this.OooO0OO = true;
        }
    }

    /* JADX INFO: renamed from: ambercore.ooO0oOOO$OooO0Oo, reason: case insensitive filesystem */
    private final class C5451OooO0Oo {
        private final String OooO00o;
        private final long[] OooO0O0;
        File[] OooO0OO;
        File[] OooO0Oo;
        private OooO0OO OooO0o;
        private boolean OooO0o0;
        private long OooO0oO;

        /* synthetic */ C5451OooO0Oo(C5450ooO0oOOO c5450ooO0oOOO, String str, OooO00o oooO00o) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void OooOOO(String[] strArr) throws IOException {
            if (strArr.length != C5450ooO0oOOO.this.OooOOo0) {
                throw OooOOO0(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.OooO0O0[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw OooOOO0(strArr);
                }
            }
        }

        private C5451OooO0Oo(String str) {
            this.OooO00o = str;
            this.OooO0O0 = new long[C5450ooO0oOOO.this.OooOOo0];
            this.OooO0OO = new File[C5450ooO0oOOO.this.OooOOo0];
            this.OooO0Oo = new File[C5450ooO0oOOO.this.OooOOo0];
            StringBuilder sb = new StringBuilder(str);
            sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            int length = sb.length();
            for (int i = 0; i < C5450ooO0oOOO.this.OooOOo0; i++) {
                sb.append(i);
                this.OooO0OO[i] = new File(C5450ooO0oOOO.this.OooOO0O, sb.toString());
                sb.append(".tmp");
                this.OooO0Oo[i] = new File(C5450ooO0oOOO.this.OooOO0O, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException OooOOO0(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File OooOO0(int i) {
            return this.OooO0OO[i];
        }

        public File OooOO0O(int i) {
            return this.OooO0Oo[i];
        }

        public String OooOO0o() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.OooO0O0) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: ambercore.ooO0oOOO$OooO0o0, reason: case insensitive filesystem */
    public final class C5452OooO0o0 {
        private final String OooO00o;
        private final long OooO0O0;
        private final long[] OooO0OO;
        private final File[] OooO0Oo;

        /* synthetic */ C5452OooO0o0(C5450ooO0oOOO c5450ooO0oOOO, String str, long j, File[] fileArr, long[] jArr, OooO00o oooO00o) {
            this(str, j, fileArr, jArr);
        }

        private C5452OooO0o0(String str, long j, File[] fileArr, long[] jArr) {
            this.OooO00o = str;
            this.OooO0O0 = j;
            this.OooO0Oo = fileArr;
            this.OooO0OO = jArr;
        }

        public File OooO00o(int i) {
            return this.OooO0Oo[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void OooOOOo(OooO0OO oooO0OO, boolean z) {
        C5451OooO0Oo c5451OooO0Oo = oooO0OO.OooO00o;
        if (c5451OooO0Oo.OooO0o != oooO0OO) {
            throw new IllegalStateException();
        }
        if (z && !c5451OooO0Oo.OooO0o0) {
            for (int i = 0; i < this.OooOOo0; i++) {
                if (!oooO0OO.OooO0O0[i]) {
                    oooO0OO.OooO00o();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!c5451OooO0Oo.OooOO0O(i).exists()) {
                    oooO0OO.OooO00o();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.OooOOo0; i2++) {
            File fileOooOO0O = c5451OooO0Oo.OooOO0O(i2);
            if (!z) {
                OooOOo(fileOooOO0O);
            } else if (fileOooOO0O.exists()) {
                File fileOooOO0 = c5451OooO0Oo.OooOO0(i2);
                fileOooOO0O.renameTo(fileOooOO0);
                long j = c5451OooO0Oo.OooO0O0[i2];
                long length = fileOooOO0.length();
                c5451OooO0Oo.OooO0O0[i2] = length;
                this.OooOOo = (this.OooOOo - j) + length;
            }
        }
        this.OooOo0++;
        c5451OooO0Oo.OooO0o = null;
        if (c5451OooO0Oo.OooO0o0 || z) {
            c5451OooO0Oo.OooO0o0 = true;
            this.OooOOoo.append((CharSequence) "CLEAN");
            this.OooOOoo.append(' ');
            this.OooOOoo.append((CharSequence) c5451OooO0Oo.OooO00o);
            this.OooOOoo.append((CharSequence) c5451OooO0Oo.OooOO0o());
            this.OooOOoo.append('\n');
            if (z) {
                long j2 = this.OooOo0O;
                this.OooOo0O = 1 + j2;
                c5451OooO0Oo.OooO0oO = j2;
            }
        } else {
            this.OooOo00.remove(c5451OooO0Oo.OooO00o);
            this.OooOOoo.append((CharSequence) "REMOVE");
            this.OooOOoo.append(' ');
            this.OooOOoo.append((CharSequence) c5451OooO0Oo.OooO00o);
            this.OooOOoo.append('\n');
        }
        OooOo0O(this.OooOOoo);
        if (this.OooOOo > this.OooOOOo || OooOoO0()) {
            this.OooOo0o.submit(this.OooOo);
        }
    }

    private synchronized OooO0OO OooOo0(String str, long j) {
        OooOOO();
        C5451OooO0Oo c5451OooO0Oo = (C5451OooO0Oo) this.OooOo00.get(str);
        OooO00o oooO00o = null;
        if (j != -1 && (c5451OooO0Oo == null || c5451OooO0Oo.OooO0oO != j)) {
            return null;
        }
        if (c5451OooO0Oo == null) {
            c5451OooO0Oo = new C5451OooO0Oo(this, str, oooO00o);
            this.OooOo00.put(str, c5451OooO0Oo);
        } else if (c5451OooO0Oo.OooO0o != null) {
            return null;
        }
        OooO0OO oooO0OO = new OooO0OO(this, c5451OooO0Oo, oooO00o);
        c5451OooO0Oo.OooO0o = oooO0OO;
        this.OooOOoo.append((CharSequence) "DIRTY");
        this.OooOOoo.append(' ');
        this.OooOOoo.append((CharSequence) str);
        this.OooOOoo.append('\n');
        OooOo0O(this.OooOOoo);
        return oooO0OO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void OooOooo() {
        try {
            Writer writer = this.OooOOoo;
            if (writer != null) {
                OooOOOO(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.OooOOO0), Fg0.OooO00o));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(StringUtils.LF);
                bufferedWriter.write("1");
                bufferedWriter.write(StringUtils.LF);
                bufferedWriter.write(Integer.toString(this.OooOOOO));
                bufferedWriter.write(StringUtils.LF);
                bufferedWriter.write(Integer.toString(this.OooOOo0));
                bufferedWriter.write(StringUtils.LF);
                bufferedWriter.write(StringUtils.LF);
                for (C5451OooO0Oo c5451OooO0Oo : this.OooOo00.values()) {
                    if (c5451OooO0Oo.OooO0o != null) {
                        bufferedWriter.write("DIRTY " + c5451OooO0Oo.OooO00o + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + c5451OooO0Oo.OooO00o + c5451OooO0Oo.OooOO0o() + '\n');
                    }
                }
                OooOOOO(bufferedWriter);
                if (this.OooOO0o.exists()) {
                    Oooo00O(this.OooOO0o, this.OooOOO, true);
                }
                Oooo00O(this.OooOOO0, this.OooOO0o, false);
                this.OooOOO.delete();
                this.OooOOoo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.OooOO0o, true), Fg0.OooO00o));
            } catch (Throwable th) {
                OooOOOO(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized C5452OooO0o0 OooOo(String str) {
        Throwable th;
        try {
            try {
                OooOOO();
                C5451OooO0Oo c5451OooO0Oo = (C5451OooO0Oo) this.OooOo00.get(str);
                if (c5451OooO0Oo == null) {
                    return null;
                }
                if (!c5451OooO0Oo.OooO0o0) {
                    return null;
                }
                for (File file : c5451OooO0Oo.OooO0OO) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                this.OooOo0++;
                this.OooOOoo.append((CharSequence) "READ");
                this.OooOOoo.append(' ');
                this.OooOOoo.append((CharSequence) str);
                this.OooOOoo.append('\n');
                if (OooOoO0()) {
                    this.OooOo0o.submit(this.OooOo);
                }
                return new C5452OooO0o0(this, str, c5451OooO0Oo.OooO0oO, c5451OooO0Oo.OooO0OO, c5451OooO0Oo.OooO0O0, null);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    public synchronized boolean Oooo000(String str) {
        try {
            OooOOO();
            C5451OooO0Oo c5451OooO0Oo = (C5451OooO0Oo) this.OooOo00.get(str);
            if (c5451OooO0Oo != null && c5451OooO0Oo.OooO0o == null) {
                for (int i = 0; i < this.OooOOo0; i++) {
                    File fileOooOO0 = c5451OooO0Oo.OooOO0(i);
                    if (fileOooOO0.exists() && !fileOooOO0.delete()) {
                        throw new IOException("failed to delete " + fileOooOO0);
                    }
                    this.OooOOo -= c5451OooO0Oo.OooO0O0[i];
                    c5451OooO0Oo.OooO0O0[i] = 0;
                }
                this.OooOo0++;
                this.OooOOoo.append((CharSequence) "REMOVE");
                this.OooOOoo.append(' ');
                this.OooOOoo.append((CharSequence) str);
                this.OooOOoo.append('\n');
                this.OooOo00.remove(str);
                if (OooOoO0()) {
                    this.OooOo0o.submit(this.OooOo);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.OooOOoo == null) {
                return;
            }
            for (C5451OooO0Oo c5451OooO0Oo : new ArrayList(this.OooOo00.values())) {
                if (c5451OooO0Oo.OooO0o != null) {
                    c5451OooO0Oo.OooO0o.OooO00o();
                }
            }
            Oooo00o();
            OooOOOO(this.OooOOoo);
            this.OooOOoo = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private C5450ooO0oOOO(File file, int i, int i2, long j) {
        this.OooOO0O = file;
        this.OooOOOO = i;
        this.OooOO0o = new File(file, "journal");
        this.OooOOO0 = new File(file, "journal.tmp");
        this.OooOOO = new File(file, "journal.bkp");
        this.OooOOo0 = i2;
        this.OooOOOo = j;
    }

    private void OooOOO() {
        if (this.OooOOoo == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void OooOOOO(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void OooOo0O(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static C5450ooO0oOOO OooOoO(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                Oooo00O(file2, file3, false);
            }
        }
        C5450ooO0oOOO c5450ooO0oOOO = new C5450ooO0oOOO(file, i, i2, j);
        if (c5450ooO0oOOO.OooOO0o.exists()) {
            try {
                c5450ooO0oOOO.OooOoo0();
                c5450ooO0oOOO.OooOoOO();
                return c5450ooO0oOOO;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c5450ooO0oOOO.OooOOo0();
            }
        }
        file.mkdirs();
        C5450ooO0oOOO c5450ooO0oOOO2 = new C5450ooO0oOOO(file, i, i2, j);
        c5450ooO0oOOO2.OooOooo();
        return c5450ooO0oOOO2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean OooOoO0() {
        int i = this.OooOo0;
        return i >= 2000 && i >= this.OooOo00.size();
    }

    private void OooOoOO() throws IOException {
        OooOOo(this.OooOOO0);
        Iterator it = this.OooOo00.values().iterator();
        while (it.hasNext()) {
            C5451OooO0Oo c5451OooO0Oo = (C5451OooO0Oo) it.next();
            int i = 0;
            if (c5451OooO0Oo.OooO0o == null) {
                while (i < this.OooOOo0) {
                    this.OooOOo += c5451OooO0Oo.OooO0O0[i];
                    i++;
                }
            } else {
                c5451OooO0Oo.OooO0o = null;
                while (i < this.OooOOo0) {
                    OooOOo(c5451OooO0Oo.OooOO0(i));
                    OooOOo(c5451OooO0Oo.OooOO0O(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private void OooOoo(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.OooOo00.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C5451OooO0Oo c5451OooO0Oo = (C5451OooO0Oo) this.OooOo00.get(strSubstring);
        OooO00o oooO00o = null;
        if (c5451OooO0Oo == null) {
            c5451OooO0Oo = new C5451OooO0Oo(this, strSubstring, oooO00o);
            this.OooOo00.put(strSubstring, c5451OooO0Oo);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            c5451OooO0Oo.OooO0o0 = true;
            c5451OooO0Oo.OooO0o = null;
            c5451OooO0Oo.OooOOO(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            c5451OooO0Oo.OooO0o = new OooO0OO(this, c5451OooO0Oo, oooO00o);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private void OooOoo0() {
        C6868y40 c6868y40 = new C6868y40(new FileInputStream(this.OooOO0o), Fg0.OooO00o);
        try {
            String strOooO0o0 = c6868y40.OooO0o0();
            String strOooO0o02 = c6868y40.OooO0o0();
            String strOooO0o03 = c6868y40.OooO0o0();
            String strOooO0o04 = c6868y40.OooO0o0();
            String strOooO0o05 = c6868y40.OooO0o0();
            if (!"libcore.io.DiskLruCache".equals(strOooO0o0) || !"1".equals(strOooO0o02) || !Integer.toString(this.OooOOOO).equals(strOooO0o03) || !Integer.toString(this.OooOOo0).equals(strOooO0o04) || !"".equals(strOooO0o05)) {
                throw new IOException("unexpected journal header: [" + strOooO0o0 + ", " + strOooO0o02 + ", " + strOooO0o04 + ", " + strOooO0o05 + C10285d4.i.e);
            }
            int i = 0;
            while (true) {
                try {
                    OooOoo(c6868y40.OooO0o0());
                    i++;
                } catch (EOFException unused) {
                    this.OooOo0 = i - this.OooOo00.size();
                    if (c6868y40.OooO0Oo()) {
                        OooOooo();
                    } else {
                        this.OooOOoo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.OooOO0o, true), Fg0.OooO00o));
                    }
                    Fg0.OooO00o(c6868y40);
                    return;
                }
            }
        } catch (Throwable th) {
            Fg0.OooO00o(c6868y40);
            throw th;
        }
    }

    private static void Oooo00O(File file, File file2, boolean z) throws IOException {
        if (z) {
            OooOOo(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Oooo00o() {
        while (this.OooOOo > this.OooOOOo) {
            Oooo000((String) ((Map.Entry) this.OooOo00.entrySet().iterator().next()).getKey());
        }
    }

    public OooO0OO OooOo00(String str) {
        return OooOo0(str, -1L);
    }

    private static void OooOOo(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public void OooOOo0() throws IOException {
        close();
        Fg0.OooO0O0(this.OooOO0O);
    }
}
