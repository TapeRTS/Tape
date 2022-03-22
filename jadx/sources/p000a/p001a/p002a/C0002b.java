package p000a.p001a.p002a;

/* renamed from: a.a.a.b */
/* loaded from: game-lib.jar:a/a/a/b.class */
public class C0002b extends AbstractC0008h {

    /* renamed from: a */
    private byte[] f0a;

    protected C0002b() {
    }

    public C0002b(int i, int i2, byte[] bArr, int i3, int i4) {
        m4407a(64, i, 6);
        m4408a(i2);
        this.f0a = new byte[i4];
        System.arraycopy(bArr, i3, this.f0a, 0, i4);
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: b */
    public int mo4405b() {
        return this.f0a.length + super.mo4405b();
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: a */
    public String mo4409a() {
        return "DAT";
    }

    /* renamed from: c */
    public byte[] m4420c() {
        return this.f0a;
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: d */
    public byte[] mo4402d() {
        byte[] d = super.mo4402d();
        System.arraycopy(this.f0a, 0, d, 6, this.f0a.length);
        return d;
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: a */
    public void mo4406a(byte[] bArr, int i, int i2) {
        super.mo4406a(bArr, i, i2);
        this.f0a = new byte[i2 - 6];
        System.arraycopy(bArr, i + 6, this.f0a, 0, this.f0a.length);
    }
}
