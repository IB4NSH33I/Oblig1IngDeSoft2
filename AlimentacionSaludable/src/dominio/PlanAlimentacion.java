package dominio;

import java.io.Serializable;

public final class PlanAlimentacion implements Serializable {

    private String nombreDelPlan;
    private Usuario usuario;
    public Profesional profesional;
    public boolean fueAtendidoElPlan;
    private String[][] planDiaADia;

    public PlanAlimentacion(String np,
            Usuario usu,
            Profesional pro,
            boolean fueAtendido,
            String[][] unPlan) {

        setNombreDelPlan(np);
        setUsuario(usu);
        setProfesional(pro);
        setFueAtendidoElPlan(fueAtendido);
        setPlanDiaADia(unPlan);
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario unUsuario) {
        if (unUsuario == null) {
            this.usuario = new Usuario(null, null, null, null, null, null, null, null);
        } else {
            this.usuario = unUsuario;
        }
    }

    public Profesional getProfesional() {
        return this.profesional;
    }

    public void setProfesional(Profesional unProfesional) {
        if (unProfesional == null) {
            this.profesional = new Profesional(null, null, null, null, null, null, null);
        } else {
            this.profesional = unProfesional;
        }
    }

    public boolean getFueAtendidoElPlan() {
        return fueAtendidoElPlan;
    }

    public void setFueAtendidoElPlan(boolean fueAtendido) {
        this.fueAtendidoElPlan = fueAtendido;
    }

    public String[][] getPlanDiaADia() {
        return this.planDiaADia;
    }

    public void setPlanDiaADia(String[][] unPlan) {
        this.planDiaADia = unPlan;
    }

    public String getNombreDelPlan() {
        return this.nombreDelPlan;
    }

    public void setNombreDelPlan(String unNombreDelPlan) {
        if (unNombreDelPlan == null || unNombreDelPlan.isEmpty()) {
            this.nombreDelPlan = "Plan de alimentación";
        } else {
            this.nombreDelPlan = unNombreDelPlan;
        }
    }

    @Override
    public String toString() {
        return this.getNombreDelPlan();
    }

    @Override
    public boolean equals(Object obj) {
        try {
            PlanAlimentacion otroPlanAlimentacion = (PlanAlimentacion) obj;
            return (this.getNombreDelPlan().equals(otroPlanAlimentacion.getNombreDelPlan())
                    && this.getUsuario().equals(otroPlanAlimentacion.getUsuario())
                    && this.getProfesional().equals(otroPlanAlimentacion.getProfesional()));
        } catch (NullPointerException e) {
            return false;
        }
    }

}
