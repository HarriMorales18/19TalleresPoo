// Interfaz
interface ServicioAutenticacion {
    boolean autenticar(String usuario, String contraseña);
}

// Implementaciones
class AutenticacionLocal implements ServicioAutenticacion {
    // Lógica de autenticación local (contra base de datos, archivo, etc.)
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        // Lógica de autenticación local (puedes usar DB, archivos, etc.)
        return true; // Si las credenciales son válidas
    }
}

class AutenticacionOAuth implements ServicioAutenticacion {
    // Lógica de autenticación OAuth (conexión a proveedor externo)
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        // Lógica de autenticación OAuth (integración con proveedor externo)
        return true; // Si la autenticación con OAuth es exitosa
    }
}

// Gestor
class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public boolean iniciarSesion(String usuario, String contraseña) {
        return servicioAutenticacion.autenticar(usuario, contraseña);
    }
}
