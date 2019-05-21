package com.criscastemendo.sprint3.app;

import android.app.Application;

import com.criscastemendo.sprint3.Data.ContadorItem;
import com.criscastemendo.sprint3.Principal.PrincipalState;
import com.criscastemendo.sprint3.Detalle.DetalleState;

import java.util.List;

public class AppMediator extends Application {


  private PrincipalState principalState;
  private DetalleState detalleState;

  private ContadorItem contador;

  public AppMediator() {
    principalState = new PrincipalState();
    detalleState = new DetalleState();
  }

  public PrincipalState getPrincipalState() {
    return principalState;
  }

  public void setPrincipalState(PrincipalState principalState) {
    this.principalState = principalState;
  }

  public DetalleState getDetalleState () {
    return detalleState;
  }

  public void setDetalleState(DetalleState detalleState) {
    this.detalleState = detalleState;
  }

  public ContadorItem getContador() {
    return contador;
  }

  public void getContadorItem (ContadorItem contador) {
    this.contador= contador;
  }
}