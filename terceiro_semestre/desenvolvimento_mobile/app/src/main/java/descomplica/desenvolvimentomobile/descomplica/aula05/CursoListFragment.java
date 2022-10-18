package descomplica.desenvolvimentomobile.descomplica.aula05;

import androidx.fragment.app.Fragment;

public class CursoListFragment {
    public static Fragment newInstance() {
        return null;
    }

    public interface OnListSelected {
        void onSelected(Curso curso);
    }
}
